package com.example.g40_70.agricularcom.util;

import com.example.g40_70.agricularcom.models.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by G40-70 on 24/05/2017.
 */

public class Data {

    public static List<Movie>  data;

    public  static  List<Movie>  getData(){
        if(data == null){
            data= new ArrayList<>();

            Movie m1 = new Movie ();
            m1.setName("Donde Estamos Ubicados");
            m1.setDescription("Visitanos Tendremos El gusto De Atenderte");
            m1.setTransporte("llama a la ruta ARCOM");
            m1.setTel("8248812 Nuestros Operadores tendran el gusto de atenderte somos una empresa que se preocupa por ti ");
            m1.setImage("https://www.google.com.co/search?biw=1366&bih=662&tbm=isch&sa=1&q=imagenes+de+google+maps+popayan+png&oq=imagenes+de+google+maps+popayan+png&gs_l=psy-ab.3...11235.12944.0.13162.8.8.0.0.0.0.493.762.2-1j0j1.2.0....0...1.1.64.psy-ab..7.0.0.7Z7xsi4qpGA#imgrc=gjdZe9u_PGQ9lM:");

            Movie m2 = new Movie ();
            m2.setName("Agricultura Urbana");
            m2.setDescription("Visitanos Tendremos El gusto De Atenderte");
            m2.setTransporte("llama a la ruta ARCOM");
            m2.setTel("8248812 Nuestros Operadores tendran el gusto de atenderte somos una empresa que se preocupa por ti ");
                    m2.setImage("https://www.google.com.co/search?q=imagenes+png+de+agricultura++urbana&tbm=isch&tbo=u&source=univ&sa=X&ved=0ahUKEwiBu4Sz94nUAhUE8CYKHYXLBiYQsAQIIw&biw=1366&bih=662#imgrc=dAICxUuS587bmM:	");

            Movie m3 = new Movie ();
            m3.setName("Abonos Organicos");
            m3.setDescription("Visitanos Tendremos El gusto De Atenderte");
            m3.setTransporte("llama a la ruta ARCOM");
            m3.setTel("8248812 Nuestros Operadores tendran el gusto de atenderte somos una empresa que se preocupa por ti ");
                    m3.setImage("https://www.google.com.co/search?biw=1366&bih=662&tbm=isch&sa=1&q=imagenes+png+de+reciclaje+solidos&oq=imagenes+png+de+reciclaje+solidos&gs_l=psy-ab.3...179147.184739.0.185159.18.18.0.0.0.0.207.2525.0j14j1.15.0....0...1.1.64.psy-ab..3.3.488...0j0i67k1.W6slaDmEIeE#imgrc=igivSRIJ8V_HFM:");

            Movie m4 = new Movie ();
            m4.setName("Reciclaje Solidos");
            m4.setDescription("Visitanos Tendremos El gusto De Atenderte");
            m4.setTransporte("llama a la ruta ARCOM");
            m4.setTel("8248812 Nuestros Operadores tendran el gusto de atenderte somos una empresa que se preocupa por ti ");
            m4.setImage("https://search?biw=1366&bih=662&tbm=isch&sa=1&q=imagenes+png+de+reciclaje+solidos&oq=imagenes+png+de+reciclaje+solidos&gs_l=psy-ab.3...179147.184739.0.185159.18.18.0.0.0.0.207.2525.0j14j1.15.0....0...1.1.64.psy-ab..3.3.488...0j0i67k1.W6slaDmEIeE#imgdii=2L_8qEB4UkU3KM:&imgrc=BTfyDKLDGSlN0M:	");

            Movie m5 = new Movie ();
            m5.setName("Trabajo Social");
            m5.setDescription("Visitanos Tendremos El gusto De Atenderte");
            m5.setTransporte("llama a la ruta ARCOM");
            m5.setTel("8248812 Nuestros Operadores tendran el gusto de atenderte somos una empresa que se preocupa por ti ");
            m5.setImage("https://www.google.com.co/search?biw=1366&bih=662&tbm=isch&sa=1&q=imagenes+png+de+trabajo+social&oq=imagenes+png+de+trabajo+social&gs_l=psy-ab.3...137634.142887.0.143177.15.15.0.0.0.0.225.2406.0j11j3.14.0....0...1.1.64.psy-ab..1.4.826...0j0i67k1.NAFxd6SokKM#imgdii=svgUhg7lc2La-M:&imgrc=IVFhhPl0ASe5hM:");

            data.add(m1);
            data.add(m2);
            data.add(m3);
            data.add(m4);
            data.add(m5);
        }
        return data;
    }
}
