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
        String [] numerostarjeta = {"4485908830181210","4539693741253664","4485398924859873"
        ,"4532146913436721","4532293894442078","4532689007829178"};
        cliente.setNumeroTarjeta(numerostarjeta[new Faker().random().nextInt(numerostarjeta.length)]);
        String [] expiraciontarjeta={"08/27","04/29","10/29","06/24","12/29","10/24"};
        cliente.setExpiracionTarjeta(expiraciontarjeta[new Faker().random().nextInt(expiraciontarjeta.length)]);
        cliente.setCodigoTarjeta(String.valueOf(faker.number().digits(3)));
        return cliente;
    }
}
