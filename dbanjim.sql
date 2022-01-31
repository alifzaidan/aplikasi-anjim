-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Des 2021 pada 13.49
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbanjim`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbregister`
--

CREATE TABLE `tbregister` (
  `nama` varchar(200) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(200) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `notelp` varchar(100) NOT NULL,
  `konfirm` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbregister`
--

INSERT INTO `tbregister` (`nama`, `email`, `password`, `gender`, `alamat`, `notelp`, `konfirm`) VALUES
('', '', '', '', '', ' ', 'null'),
('Alif Zaidan', 'admin@gmail.com', 'Admin123', 'Laki-Laki', 'Malang', '082546784123 ', '[Ljava.lang.Object;@1a4b69ba'),
('Nenden Nuraeni', 'nenden@gmail.com', 'Cantik123', 'Perempuan', 'Tuban', '0895359766800 ', '[Ljava.lang.Object;@4ceff83');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbwakafbendabergerak`
--

CREATE TABLE `tbwakafbendabergerak` (
  `nik` varchar(100) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `bendawakaf` varchar(200) NOT NULL,
  `tanggal` varchar(20) NOT NULL,
  `atasnama` varchar(200) NOT NULL,
  `konfirm` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbwakafbendabergerak`
--

INSERT INTO `tbwakafbendabergerak` (`nik`, `nama`, `alamat`, `gender`, `bendawakaf`, `tanggal`, `atasnama`, `konfirm`) VALUES
('1234567890', 'NENDEN NURAENI', 'TUBAN', 'Perempuan', 'Mobil', '26-12-2021', 'Dara Sundara', 'Tidak Bersedia'),
('212223242526', 'MUCHAMMAD ALIF ZAIDAN', 'Malang ', 'Laki-Laki', 'Mesin Diesel', '25-12-2021', 'MUCHAMMAD ALIF ZAIDAN', 'Bersedia'),
('31323334353637', 'JEMMY HADZLAN RAKAPALWA', 'Bali', 'Laki-Laki', 'Pesawat', '30-12-2021', 'Siti Markonah', 'Bersedia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbwakafbendatidakbergerak`
--

CREATE TABLE `tbwakafbendatidakbergerak` (
  `nik` varchar(100) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `bendawakaf` varchar(200) NOT NULL,
  `panjang` varchar(20) NOT NULL,
  `lebar` varchar(20) NOT NULL,
  `luas` varchar(20) NOT NULL,
  `tanggal` varchar(20) NOT NULL,
  `atasnama` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbwakafbendatidakbergerak`
--

INSERT INTO `tbwakafbendatidakbergerak` (`nik`, `nama`, `alamat`, `gender`, `bendawakaf`, `panjang`, `lebar`, `luas`, `tanggal`, `atasnama`) VALUES
('1234567890', 'JEMMY HADZLAN RAKAPALWA', 'Bali', 'Laki-Laki', 'Tanah', '30', '15', '450', '21-11-2021', 'JEMMY HADZLAN RAKAPALWA'),
('212223242526', 'NENDEN NURAENI', 'Tuban', 'Perempuan', 'Bangunan Pondok', '50', '30', '1500', '26-12-2002', 'Yuli '),
('31323334353637', 'MUCHAMMAD ALIF ZAIDAN', 'Malang', 'Laki-Laki', 'Tanah', '15', '10', '150', '1-12-2021', 'Tukiem');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbwakafuang`
--

CREATE TABLE `tbwakafuang` (
  `nik` varchar(100) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `nominal` varchar(20) NOT NULL,
  `tanggal` varchar(100) NOT NULL,
  `atasnama` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbwakafuang`
--

INSERT INTO `tbwakafuang` (`nik`, `nama`, `alamat`, `gender`, `nominal`, `tanggal`, `atasnama`) VALUES
('123456789', 'ABD HAFIZD MUAAIZ', 'Probolinggo', 'Laki-Laki', '1.000.000', '21-12-2021', '1.000.000');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbregister`
--
ALTER TABLE `tbregister`
  ADD PRIMARY KEY (`email`,`notelp`);

--
-- Indeks untuk tabel `tbwakafbendabergerak`
--
ALTER TABLE `tbwakafbendabergerak`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `tbwakafuang`
--
ALTER TABLE `tbwakafuang`
  ADD PRIMARY KEY (`nik`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
