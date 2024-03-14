package com.mycompany.practical3;
class AutoService {
    public void modify(Car car) {
        String modifiedName = car.getName()
                .replace("a", "o")
                .replace("i", "e")
                .toUpperCase();
        car.setName(modifiedName);
    }
}
