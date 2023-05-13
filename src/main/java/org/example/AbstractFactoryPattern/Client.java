package org.example.AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        /**
         * our main intention was to all assemble method of a GPU
         * but there are multiple types of GPU, hence there we followed inheritance
         * and each GPU implemented its assemble method
         *
         * now the problem is how to call assemble on a concrete GPU (following SOLID)
         * for this we have factory pattern, where we created Company class, to call assemble
         * method on concrete GPU, and clint will create concrete company as per requirements
         */
        Company company = new AsusCompany();
        company.assemble();

        /**
         * now along with GPU we also started selling monitor,
         * that is
         * MSI can create gpu and monitor
         * Asus can create gpu and monitor
         *
         * and we have to call assemble method on any object we get
         *
         * so we can think of adding if-else code in AsusCompany method(as company is same here), and if it is asking for GPU
         * we will return new GPU, else if it is asking for Monitor, we will give monitor. but to follow solid, we want to remove
         * dependence on request and remove if-else(if possible)
         */
    }
}
