package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * @author gisung.go
 * @since 2024-01-04
 * */
class FIlePrinter {

    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val bufferedReader = BufferedReader(FileReader(file))
        println(bufferedReader)
        bufferedReader.close()
    }

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}