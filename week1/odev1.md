<h1>ODEV 1</h1>

---
<b>Soru 1</b>
Pass by value, pass by reference nedir?

<b>Cevap 1</b>
Pass by value (deger gecirme), pass by reference (referans gecirme). Java programlama dili pass by value calisan bir programlama dilidir. Metotlara parametreler gecilmeden once parametrenin degeri belirlenir. Bu belirlenen deger bellekte bir alana kopyalanir ve sonrasinda parametre aktarimi gerceklestirilir. Bu parametre aktarimi yapilirken, bellek alaninin adresinin kendisi degil kopyasi metoda gonderilir.


Kod ornegi icin: 
<details>
public class SoruBir {
    public static void main(String[] args) {
      Patika patikaObj = new Patika("patikaObjeckt 1");
      System.out.println(patikaObj);
      testMethod(patikaObj);
      System.out.println(patikaObj);
    }
    public static void testMethod(Patika patikaObjX) {
        patikaObjX = new Patika("object 2");
    }
}
 class Patika {
    public Patika(String x){
    }
}
</details>

---

<b>Soru 2</b>
Immutability nedir, neden onemlidir? Bir Java sınıfı nasıl immutable yapilir?

<b>Cevap 2</b>
Immutable yapilari degismez yapilar olarak tanimlayabiliriz. String, Integer, Boolean gibi butun wrapper classlar immutable yapilardir. Bir kere oluşturulur ve sonrasinda degismezler. 
Immutable yapilar bizlere basit tasarimlar saglar. Olusturulan nesnelere her islemde degismek zorunda kalmazlar. Ayrıca ilk degerlerini cunstructor uzerinden alırlar ve bu degerde sabit kalirlar. 
Immutable nesneler degismez demistik. Onları degistirebilmek icin bir klonunu olusturup, onun uzerinden degisim islemleri yapabiliriz.
Peki bir sinifi nasil immutable yapariz?
1- Sinifi "final" anahtari ile isaretlemeliyiz. Boylece extend edilmez.
2- Sınıfın butun alanlarını "private" yapmaliyiz. Boylece dogrudan erisilemez.
3- Setter metodları tanımlamamalıyız.
4- Degistirilebilen tum alanlari "final" yapmaliyiz.
5- Tum alanlarin ilk degerlerini constructor ile belirlemeliyiz.

---

<b>Soru 3</b>
Framework ve library arasindaki fark nedir?

<b>Cevap 3</b>
Library ve framework arasında amac anlaminda bir fark yok. Iki kavramda kodlama yaparken islerimizi kolaylastirmak amaciyla gelistirildi.
Library ve framework teknik anlamda birbirinden ayrilmaktadir. Library, almis oldugumuz kodu, program icerisinde nerede ve ne zaman kullanacagima karismaz.
Framework ise, kullanacagimiz ozelligi dokuman icerisinde belirtildigi sekilde kullanmamizi ister. Belirtildigi gibi kullanilmazsa, kullanim disi kalir.
Ornek olarak: Javascript frameworku olan React

---

<b>Soru 4</b>
Java'da Garbage Collector gorevı nedir?

<b>Cevap 4</b>
Java'da bellke yonetimi arka planda JVM ve onun icerisinde yer alan Garbage Collector (cop toplayıcısı) ile yapilir. Kodlama esnasinda yeni nesneler olustururuz ve Garbage Collector bizim icin memory islemlerini yonetir. 
Yazilim sirasinda olusturdugumuz gereksiz nesneler bellekte yer kaplar ve memory leak problemleri ile karsilasabiliriz. Bu sebeple Java'da garbage collector'i anlamak, efektif kod yazimi icin yazilimcilara kolaylik saglar.

---

<b>Soru 5</b>
Memory Leak nedir?

<b>Cevap 5</b>
Yiginda artik kullanilmayan nesnelerin bulundugu ancak garbage collector'in bunlari bellekten cikaramadigi ve gereksiz yere bakiminin yapildigi durumdur.

---

<b>Soru 6</b>
Yeni Java surumleri ne siklikla cikmaktadir?

<b>Cevap 6</b>
Java 10 surumunden sonra her 6 ayda bir yeni surumler cikmaktadir.

---

<b>Soru 7</b>
Stack ve heap nedir? Java'da nasil kullanilir?

<b>Cevap 7</b>
Eger program esnasinda boyutlari bildirilmis degismez bir deger kullaniyorsak stack, degisebilir bir deger kullaniyorsak heap kullanmaliyiz. Stack ve heap bilgisayarda RAM'de tutulur.
Stack deger tipleri, pointer ve adresler saklanirken, heap'te referans degerleri saklanmaktadir.
Stack'e ulasmak, heap'e ulasmaktan daha hizlidir. Stack LIFO (Last-In-First-Out) mantiginda calismaktadir. Yani en son eklenen eleman, ilk çıkar. Bunu ust uste dizdigimiz kitaplardan ornek verebiliriz. En alltaki kitabi almak cok zordur. Biz de bu sebeple, en son koydugumuz en ustteki kitabi aliriz. Aradan bir kitap cıkaramayız. Stack'de boyledir. Aradaki elemanlar birbirleri ile iliskilidir bu sebeple herhangi bir elemani aradan secip, cikartamayiz.
Stack uzerinde kullanim fazla oldugunda alan yeterli olmayabilir.
Heap eger dogru kullanilmazsa bellek sorunlari olusturabilir. Ihtiyacimiz olan boyutu bilmiyorsak heap en uygun secenektir.

---

<b>Soru 8</b>
OpenJDK ve OracleJDK arasindaki farklar nedir?

<b>Cevap 8</b>
OpenJDK, Java SE Platform Edition'in ucretsiz ve acik kaynakli bir uygulamasidir. 
Oracle her uc yilda bir yeni surum sunarken OpenJDK her alti ayda bir yeni surum piyasaya surmektedir. Bu sebeple Oracle surumleri uzun vadeli projelerde destek saglar. OpenJDK bir sonraki surum yayinlanana kadar mevcut surumdaki degisiklikleri destekler.

---

<b>Soru 9</b>
@FunctionalInterface anotasyonu nedir?

<b>Cevap 9</b>
Functional interface, Java 8 ile gelmis ozelliklerden biridir. 
Icerisinde bir tane abstract metod bulunan intarface'lerdir. Bu yuzden "Single Abstract Method Interface" olarak da bilinirler. Lambda expression ile kullanilabilmesi icin gelistirilmistir.
Bu ozelligi kullanabilmek icin @FunctionalInterface anotasyonu vardır ancak kullanimi zorunlu degildir. Bu anotasyon interface icerisinde 1 tane abstract metodun olup olmadigini kontrol eder. Eger 2 adet abstract metod varsa kod derlenmez.

---

<b>Soru 10</b>
Java'da hangi functional interface'ler yer almaktadir? 

<b>Cevap 10</b>
Function : Bir nesnenin turunu degistirmek icin kullanilir.
Consumer : T turunda bir parametre alir. T turunde bir nesne alip onun uzerinde islem yapar. Geriye deger dondurmez.
Supplier : T turunde bir deger saglar.
Predicate : Nesne uzerinde dogrulama yapmamizi saglar. Boolean deger dondurur.
