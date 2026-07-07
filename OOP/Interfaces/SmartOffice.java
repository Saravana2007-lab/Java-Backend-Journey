package Interfaces;

interface Printable {
    void printDocument();
}

interface Scannable {
    void scanDocument();
}

class OfficePrinter implements Printable {
    @Override
    public void printDocument() {
        System.out.println("Office Printer is printing...");
    }
}


class OfficeScanner implements Scannable {
    @Override
    public void scanDocument() {
        System.out.println("Office Scanner is scanning...");
    }
}

class MultiFunctionPrinter implements Printable, Scannable {
    @Override
    public void printDocument() {
        System.out.println("MultiFunction Printer is printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("MultiFunction Printer is scanning...");
    }
}

public class SmartOffice {
    public static void main(String[] args) {
        
        Printable[] printers = { new OfficePrinter(), new MultiFunctionPrinter() };
        for (Printable p : printers) {
            p.printDocument();
        }

       
        Scannable[] scanners = { new OfficeScanner(), new MultiFunctionPrinter() };
        for (Scannable s : scanners) {
            s.scanDocument();
        }
    }
}
