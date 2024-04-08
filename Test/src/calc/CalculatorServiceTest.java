package calc;

import static org.junit.jupiter.api.Assertions.*;

import java.security.Provider.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.extensions.TestSetup;

class CalculatorServiceTest {
    
    private Calculator calculator;
    private CalculatorService service;

    
    @BeforeEach 
    public void setUp(){
        calculator = new Calculator();
        service = new CalculatorService(calculator);
    }
    
    
    @Test
    public void testAddAndReport() {
        assertEquals("Result5", service.addAndReport(2, 3));
    }

    
    @Test
    void testSubtractAndReport() {
        assertEquals("Result1", service.subtractAndReport(3, 2));
    }

}
