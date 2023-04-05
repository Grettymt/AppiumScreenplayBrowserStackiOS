package android.demoapk.util;

import android.demoapk.models.Cliente;
import com.github.javafaker.Faker;

import java.util.Locale;

public class GenerateCliente {

    public static Cliente generateCliente(){
        Faker faker = new Faker(new Locale("en"));
        Cliente cliente = new Cliente();
        cliente.setNombre(faker.name().fullName());
        cliente.setDireccion(faker.address().streetAddress());
        cliente.setCiudad(faker.address().city());
        cliente.setEstado(faker.address().state());
        cliente.setCodigoPostal(faker.address().zipCode());
        cliente.setPais(faker.address().country());
        cliente.setNumeroTarjeta(faker.business().creditCardNumber());
        cliente.setExpiracionTarjeta(faker.business().creditCardExpiry());
        cliente.setCodigoTarjeta(String.valueOf(faker.number().digits(3)));
        return cliente;
    }
}
