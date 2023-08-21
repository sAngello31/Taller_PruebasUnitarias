/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.pruebasunitarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Torremar
 */

public class EmployeeTest {

    @Test
    public void testWorker() {
        Employee worker = new Employee(1000.0F, "USD", 0.1F, EmployeeType.Worker);
        assertEquals(1000.0F, worker.cs());
    }

    @Test
    public void testSupervisor() {
        Employee supervisor = new Employee(1500.0F, "USD", 0.2F, EmployeeType.Supervisor);
        assertEquals(1500.07F, supervisor.cs());
    }

    @Test
    public void testManager() {
        Employee manager = new Employee(2000.0F, "USD", 0.3F, EmployeeType.Manager);
        assertEquals(2000.21F, manager.cs());
    }
    
     @Test
    public void testWorkerWithBonus() {
        Employee worker = new Employee(1000.0F, "USD", 0.1F, EmployeeType.Worker);
        assertEquals(386.0F, worker.CalculateYearBonus());
    }

    @Test
    public void testSupervisorWithBonus() {
        Employee supervisor = new Employee(1500.0F, "USD", 0.2F, EmployeeType.Supervisor);
        assertEquals(1693.0F, supervisor.CalculateYearBonus());
    }

    @Test
    public void testManagerWithBonus() {
        Employee manager = new Employee(2000.0F, "USD", 0.3F, EmployeeType.Manager);
        assertEquals(2386.0F, manager.CalculateYearBonus());
    }
    
    @Test
    public void testManagerWithDifferentCurrency() {
        Employee manager = new Employee(2000.0F, "EUR", 0.3F, EmployeeType.Manager);
        assertEquals(1900.21F, manager.cs());
        assertEquals(2286.0F, manager.CalculateYearBonus());
    }
    
    @Test
    public void testManagerWithoutDifferentCurrency() {
        Employee manager = new Employee(2000.0F, "USD", 0.3F, EmployeeType.Manager);
        assertEquals(2000.21F, manager.cs());
        assertEquals(2386.0F, manager.CalculateYearBonus());
    }

    @Test
    public void testWorkerWithEvenMonth() {
        Employee worker = new Employee(1000.0F, "USD", 0.1F, EmployeeType.Worker);
        assertEquals(1000.0F, worker.cs());
        assertEquals(386.0F, worker.CalculateYearBonus());
    }

    @Test
    public void testSupervisorWithOddMonth() {
        Employee supervisor = new Employee(1500.0F, "USD", 0.2F, EmployeeType.Supervisor);
        assertEquals(1564.4033F, supervisor.cs());
        assertEquals(1693.0F, supervisor.CalculateYearBonus());
    }
    
    
}

