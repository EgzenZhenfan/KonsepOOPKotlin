package Inheritance

import java.text.NumberFormat
import java.util.*

open class EmployeeD {
    // "open" memungkinkan subclass override properti ini
    open val baseSalary: Int = 3_000_000
}

class Programmer : EmployeeD() {
    override val baseSalary: Int = 5_000_000
}

class SoftwareEngineer : EmployeeD() {
    override val baseSalary: Int = 6_000_000
}

class ProjectManager : EmployeeD() {
    override val baseSalary: Int = 8_000_000
}

fun toRupiahFormat(baseSalary: Int): String {
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return numberFormat.format(baseSalary)
}

fun main() {
    val employee = EmployeeD()
    println("Rata-rata gaji ${employee.javaClass.simpleName} = ${toRupiahFormat(employee.baseSalary)}")

    val programmer = Programmer()
    println("Rata-rata gaji ${programmer.javaClass.simpleName} = ${toRupiahFormat(programmer.baseSalary)}")

    val softwareEngineer = SoftwareEngineer()
    println("Rata-rata gaji ${softwareEngineer.javaClass.simpleName} = ${toRupiahFormat(softwareEngineer.baseSalary)}")

    val projectManager = ProjectManager()
    println("Rata-rata gaji ${projectManager.javaClass.simpleName} = ${toRupiahFormat(projectManager.baseSalary)}")
}
