-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3309
-- Generation Time: Jan 31, 2023 at 05:18 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `userdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `empid` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `retypepass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`empid`, `firstname`, `lastname`, `username`, `password`, `retypepass`) VALUES
('E001', 'Nisula', 'Premaratne', 'admin', 'admin@123', 'admin@123');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `sid` varchar(50) NOT NULL,
  `name_with_initials` varchar(50) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `nic` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `courseid` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`sid`, `name_with_initials`, `fullname`, `nic`, `dob`, `gender`, `address`, `email`, `telephone`, `courseid`, `course`) VALUES
('S001', 'R.A.N.C. Premaratne', 'R.A. Nisula Chanthika Premaratne', '200034902210', '2000-12-14', 'Male', 'Panadura', 'nisula.rap@gmail.com', '0713347882', 'ICTNVQ5', 'ICT - NVQ 05'),
('S002', 'K.B.H Perera', 'K.B. Hearth Perera', '993564782V', '1999-09-04', 'Male', 'Galle', 'hearth10@gmail.com', '0776859324', 'MTRNVQ5', 'Mechatronic - NVQ 05'),
('S003', 'T.B. Lakshan', 'Thalawathugoda Bimal Lakshan', '996873586V', '1999-02-18', 'Male', 'Kagalle', 'bimal99@gmail.com', '0786593274', 'AMNVQ5', 'Automobile - NVQ 05'),
('S004', 'S. Perera', 'Sadini Perera', '200068735868', '2000-05-28', 'Female', 'Hikkaduwa', 'sadini528@gmail.com', '0776593282', 'ACCNVQ5', 'Accounting - NVQ 05'),
('S005', 'K.P Gunasekara', 'Kaveesha Piyumali Gunasekara', '983578153V', '1998-06-17', 'Female', 'Kandy', 'kaveesha@gmail.com', '0706593292', 'ICTNVQ5', 'ICT - NVQ 05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`empid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`sid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
