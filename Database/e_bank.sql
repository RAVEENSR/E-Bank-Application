-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2017 at 03:44 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `e_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `client_details`
--

CREATE TABLE `client_details` (
  `id` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(100) NOT NULL,
  `mobile` int(10) NOT NULL,
  `e_mail` varchar(50) NOT NULL,
  `account_number` int(20) NOT NULL,
  `account_type` varchar(20) NOT NULL,
  `sort_code` varchar(10) NOT NULL,
  `balance` int(11) NOT NULL,
  `card` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client_details`
--

INSERT INTO `client_details` (`id`, `name`, `dob`, `address`, `mobile`, `e_mail`, `account_number`, `account_type`, `sort_code`, `balance`, `card`) VALUES
(1, 'Nimal Perera', '1999-09-10', 'Colombo', 712345678, 'nimal@gmail.com', 100, 'Personnel', '11', 10000, '1000'),
(2, 'Mahinda Weereasingha', '1945-05-20', 'Matara', 113445672, 'mahinda@gmail.com', 101, 'Savings', '12', 12000, '1002'),
(3, 'Anjelo Mathews', '1990-09-09', 'Colombo', 711111111, 'mathews@gmail.com', 1234, 'Joint', '1', 1000000, '1005'),
(4, 'Dinesh Chandimal', '1988-02-23', 'Kandy', 771111111, 'chandi@yahoo.com', 1234, 'Joint', '1', 200000, '1006'),
(5, 'Shihan Mihiranga', '1984-10-09', 'Hambanthota', 756739203, 'shihan@gmail.com', 104, 'Personal', '4', 100, '1007'),
(6, 'Ishani Kumarasiri', '1996-12-25', 'Matara', 789765432, 'ishani@ymail.com', 108, 'Savings', '2345', 2235700, '1009'),
(7, 'Sarath Gunapala', '1975-03-04', 'Negombo', 781111111, 'sarath@nasa.us', 110, 'Foreign Remittance', '34', 120000000, '1011');

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

CREATE TABLE `employee_details` (
  `name` varchar(40) NOT NULL,
  `position` varchar(40) NOT NULL,
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`name`, `position`, `username`, `password`) VALUES
('Administrator', 'Main Administrator', 'admin', '123'),
('Sunil Perera', 'Cleaner', 'sunil', '123'),
('Raveen Rathnayake', 'raveen', 'raveen', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client_details`
--
ALTER TABLE `client_details`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `e_mail` (`e_mail`,`account_number`);

--
-- Indexes for table `employee_details`
--
ALTER TABLE `employee_details`
  ADD PRIMARY KEY (`username`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `client_details`
--
ALTER TABLE `client_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
