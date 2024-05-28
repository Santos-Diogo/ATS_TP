module Main where

import Test.QuickCheck
import System.Random (randomRIO)
import Data.Char (chr)

data Acao = Comprar | Vender deriving (Show, Enum, Bounded)

data Produto = Produto {
    tipo :: String,
    descricao :: String,
    marca :: String,
    preco :: Int,
    usado :: Bool,
    quantidade :: Int,
    tamanho :: String,
    cor :: String,
    ano :: Int,
    extra :: Maybe String
} deriving (Show)

instance Arbitrary Acao where
    arbitrary = elements [minBound .. maxBound]

generateString :: Int -> Gen String
generateString n = vectorOf n $ elements (['a'..'z'] ++ ['A'..'Z'] ++ ['0'..'9'] ++ " ")

instance Arbitrary Produto where
    arbitrary = do
        t <- elements ["Sapatilha", "T-shirt", "Mala"]
        d <- generateString 10
        m <- generateString 10
        p <- choose (10, 500)
        u <- arbitrary
        q <- choose (1, 100)
        tam <- elements ["S", "M", "L", "XL"]
        c <- elements ["preto", "branco", "vermelho", "azul"]
        a <- choose (2000, 2023)
        e <- frequency [(1, Just <$> generateString 10), (9, return Nothing)]
        return $ Produto t d m p u q tam c a e

generateLog :: IO ()
generateLog = do
    amostras <- generate $ vectorOf 10 (arbitrary :: Gen (Acao, Produto))
    let logEntries = map (\(acao, produto) -> formatLogEntry acao produto) amostras
    writeFile "generated_logs.txt" (unlines logEntries)

formatLogEntry :: Acao -> Produto -> String
formatLogEntry acao produto = "15:05:2023," ++ show (fromEnum acao + 1) ++ "," ++ show acao ++ "," ++ formatProduto produto

formatProduto :: Produto -> String
formatProduto (Produto t d m p u q tam c a e) =
    t ++ "," ++ d ++ "," ++ m ++ "," ++ show p ++ "," ++ show u ++
    "," ++ show q ++ "," ++ tam ++ "," ++ c ++ "," ++ show a ++
    maybe "" ("," ++) e

main :: IO ()
main = generateLog
