-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 05-Dez-2022 às 02:26
-- Versão do servidor: 10.4.25-MariaDB
-- versão do PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `barbearia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `Nome` varchar(100) DEFAULT NULL,
  `Contato` varchar(100) DEFAULT NULL,
  `Horario` varchar(100) DEFAULT NULL,
  `Data` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipamento`
--

CREATE TABLE `equipamento` (
  `Equipamento` varchar(100) DEFAULT NULL,
  `Id` varchar(100) NOT NULL,
  `Fornecedor` varchar(100) DEFAULT NULL,
  `Funcionario` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `Nome` varchar(100) DEFAULT NULL,
  `Id` varchar(100) NOT NULL,
  `Cpf` varchar(100) DEFAULT NULL,
  `Contato` varchar(100) DEFAULT NULL,
  `Endereco` varchar(100) DEFAULT NULL,
  `Senha` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`Nome`, `Id`, `Cpf`, `Contato`, `Endereco`, `Senha`) VALUES
('Felipe', '1', '123.456.789-19', '(12)98765-4321', 'Rua Dom Bosco,787', '1');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagar`
--

CREATE TABLE `pagar` (
  `Nome` varchar(100) DEFAULT NULL,
  `Data` varchar(100) DEFAULT NULL,
  `Valor` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `preco`
--

CREATE TABLE `preco` (
  `Cabelo` varchar(100) DEFAULT NULL,
  `Barba` varchar(100) DEFAULT NULL,
  `Sobrancelha` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `equipamento`
--
ALTER TABLE `equipamento`
  ADD PRIMARY KEY (`Id`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Cpf` (`Cpf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
