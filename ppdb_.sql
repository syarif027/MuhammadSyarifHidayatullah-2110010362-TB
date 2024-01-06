-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Jan 2024 pada 06.30
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ppdb_`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `orangtua`
--

CREATE TABLE `orangtua` (
  `nik` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `namaayah` varchar(100) NOT NULL,
  `pekerjaanayah` varchar(100) NOT NULL,
  `gajiayah` int(100) NOT NULL,
  `namaibu` varchar(100) NOT NULL,
  `pekerjaanibu` varchar(100) NOT NULL,
  `gajiibu` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `orangtua`
--

INSERT INTO `orangtua` (`nik`, `nama`, `namaayah`, `pekerjaanayah`, `gajiayah`, `namaibu`, `pekerjaanibu`, `gajiibu`) VALUES
(2110010362, 'syarif', 'ali', 'pns', 2500000, 'pertiwi', 'rumah tangga', 100000),
(2110010369, 'Muhammad syarif Hidayatullah', 'aliansyah', 'PNS', 2000000, 'dara', 'IRT', 300000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `siswa`
--

CREATE TABLE `siswa` (
  `nik` int(11) NOT NULL,
  `jenis_kelamin` varchar(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tempat_lahir` varchar(100) NOT NULL,
  `tanggal_lahir` varchar(100) NOT NULL,
  `agama` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `asal_sekolah` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `siswa`
--

INSERT INTO `siswa` (`nik`, `jenis_kelamin`, `nama`, `tempat_lahir`, `tanggal_lahir`, `agama`, `alamat`, `asal_sekolah`) VALUES
(21000367, 'Laki-Laki', 'syarif', 'Banjarbaru', '27-09-2001', 'Islam', 'jl taruna praja', 'sma 2 banjarbaru');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `no_transaksi` int(100) NOT NULL,
  `nik` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `pembayaran` varchar(100) NOT NULL,
  `transaksi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`no_transaksi`, `nik`, `nama`, `pembayaran`, `transaksi`) VALUES
(321, 2110010363, 'Muhammad Syarif Hidayatullah', 'BNI', '2500000'),
(12345, 2110010362, 'syarif', 'Bank Kalsel', '2500000');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `orangtua`
--
ALTER TABLE `orangtua`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nik`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`no_transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
