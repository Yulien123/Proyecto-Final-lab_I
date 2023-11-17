-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2023 a las 19:34:31
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `empresa`
--
CREATE DATABASE IF NOT EXISTS `empresa` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `empresa`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `IdProveedor` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `IdProveedor`, `fecha`, `estado`) VALUES
(1, 2, '2022-06-22', 0),
(2, 2, '2022-06-22', 0),
(3, 5, '2023-11-08', 1),
(4, 4, '2023-11-06', 1),
(5, 5, '2023-11-08', 1),
(6, 4, '2023-11-06', 1),
(7, 1, '2023-11-11', 1),
(14, 5, '2023-06-08', 1),
(15, 3, '2023-11-14', 1),
(16, 5, '2023-06-08', 1),
(17, 2, '2023-11-16', 1),
(18, 5, '2023-11-16', 1),
(19, 4, '2023-11-16', 1),
(20, 3, '2023-11-16', 1),
(21, 4, '2023-11-16', 1),
(22, 3, '2023-11-16', 1),
(23, 6, '2023-11-03', 1),
(24, 4, '2023-11-16', 1),
(25, 5, '2023-11-16', 1),
(26, 6, '2023-11-16', 1),
(27, 2, '2023-11-16', 1),
(28, 4, '2023-11-16', 1),
(29, 5, '2023-11-16', 1),
(30, 5, '2023-11-16', 1),
(31, 6, '2023-11-16', 1),
(32, 5, '2023-11-16', 1),
(33, 3, '2023-11-16', 1),
(34, 6, '2023-11-16', 1),
(35, 5, '2023-11-16', 1),
(36, 7, '2023-11-16', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idCompra` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`idDetalle`, `cantidad`, `precioCosto`, `idCompra`, `IdProducto`, `estado`) VALUES
(3, 1, 100000, 7, 8, 1),
(4, 1, 100000, 7, 8, 1),
(5, 1, 158000, 4, 7, 1),
(6, 1, 158000, 4, 7, 1),
(7, 2, 70000, 2, 9, 1),
(8, 2, 70000, 2, 9, 1),
(9, 2, 100000, 26, 5, 0),
(10, 1, 100000, 27, 5, 0),
(11, 1, 90000, 28, 4, 0),
(12, 1, 100000, 36, 5, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(30) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcion`, `precioActual`, `stock`, `estado`) VALUES
(1, 'Perfume', 'Perfumeria', 19900, 10, 1),
(2, 'Celular moto G1', 'camara, ram, cpu, pantalla \"', 100000, 15, 1),
(3, 'Celular A100', 'camara, ram, cpu y pantalla \"', 120000, 20, 1),
(4, 'Celular moto G10', 'camara, ram, cpu, pantalla \"', 90000, 24, 1),
(5, 'Celular moto G1', 'camara, ram, cpu, pantalla \"', 100000, 11, 1),
(6, 'Celular A100', 'camara, ram, cpu y pantalla \"', 120000, 20, 1),
(7, 'Celular A155', 'camara, ram, cpu y pantalla \"', 158000, 10, 1),
(8, 'smart tv', ' pantalla 55\" led audio hq 4k', 70000, 8, 1),
(9, 'smart tv', ' pantalla 55\" led audio hq 4k', 70000, 8, 1),
(10, 'Heladera LG puerta doble', 'Heladera smart', 70000, 4, 1),
(11, 'Parlante jbl', 'Parlante JBL hq ultra bass ', 150000, 3, 1),
(12, 'Auriculares Noga', 'Auriculares Noga bluetooth con calidad hq', 70000, 3, 1),
(13, 'Mouse gamer Dragon', 'Mouse con LED RGB con cable mallado', 50000, 4, 1),
(14, 'Heladera LG puerta doble', 'Heladera smart', 70000, 4, 1),
(15, 'Parlante jbl', 'Parlante JBL hq ultra bass ', 150000, 3, 1),
(16, 'Auriculares Noga', 'Auriculares Noga bluetooth con calidad hq', 70000, 3, 1),
(17, 'Mouse gamer Dragon', 'Mouse con LED RGB con cable mallado', 50000, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `razonSocial` varchar(20) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `telefono` bigint(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `razonSocial`, `domicilio`, `telefono`, `estado`) VALUES
(1, 'LG', 'Busan Corea del Sur', 234567891, 0),
(2, 'Sanyo Electric', 'Osaka Japon', 123456789, 1),
(3, 'Noga', 'Tokyio 1100', 123456789, 1),
(4, 'Samsung', 'calle callejera 383', 1234534, 1),
(5, 'Motorola', 'caminito 151', 12323104, 1),
(6, 'Redmi', 'China 123', 123456789, 1),
(7, 'Sony', 'illia', 123456789, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `IdProveedor` (`IdProveedor`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `idCompra` (`idCompra`),
  ADD KEY `IdProducto` (`IdProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`),
  ADD UNIQUE KEY `razonSocial` (`razonSocial`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`IdProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`),
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
