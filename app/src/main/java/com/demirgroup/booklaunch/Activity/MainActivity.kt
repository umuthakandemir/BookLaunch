package com.demirgroup.booklaunch.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.demirgroup.booklaunch.Adapter.BookAdapter
import com.demirgroup.booklaunch.Model.BookModel
import com.demirgroup.booklaunch.R
import com.demirgroup.booklaunch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //load var.. data with bookmodel class
        val icimizdekiseytan = BookModel("Sabahattin Ali",R.drawable.sabahattinali,"İçimizdeki Şeytan",icimizdekiseytan)
        val sapians = BookModel("Yuval Noah Harari",R.drawable.yuvalnoah,"Sapiens:'İnsan Türünün Kısa Bir Tarihi'",Sapiens)
        val korluk = BookModel("Jose Saramago",R.drawable.josesaramago,"Körlük",Korluk)
        val sucveceza= BookModel("Dostoyevski",R.drawable.dotoyevski,"Suç Ve Ceza",Sucveceza)
        val hayvanmezarligi = BookModel("Stephen King",R.drawable.king,"Hayvan Mezarlığı",Hayvanmezarligi)
        val bookList:ArrayList<BookModel> = ArrayList()
        bookList.add(icimizdekiseytan)
        bookList.add(sapians)
        bookList.add(korluk)
        bookList.add(sucveceza)
        bookList.add(hayvanmezarligi)
        val adapter:BookAdapter= BookAdapter(bookList)
        binding.bookLauncherRecyclerview.layoutManager = LinearLayoutManager(this)
        binding.bookLauncherRecyclerview.adapter = adapter
    }
    public val icimizdekiseytan:String = "İçimizdeki Şeytan, Sabahattin Ali'nin unutulmaz romanlarından biridir. Bu eser, toplum baskısı ve içsel çatışmaların merkezindeki bir karakterin hikayesini anlatır. Sabahattin Ali'nin sivri kalemi, romanı okuyanları derinden etkiler ve düşünmeye sevk eder.\n" +
            "\n" +
            "Hikaye, Cemil adında bir öğretmenin gözünden aktarılır. Cemil, Anadolu'nun küçük bir kasabasında görev yapmaktadır. Düşüncelerini ve hayallerini toplumun beklediği normlara uydurmak zorunda olan bir karakterdir. Ancak içsel çelişkileri ve hayal kırıklıkları onu rahatsız etmektedir.\n" +
            "\n" +
            "Cemil'in hayatı, Nuran adında bir kadının kasabaya gelmesiyle değişir. Nuran'ın özgür ruhu ve düşünleri, Cemil'in içindeki şeytanı uyandırır. Cemil Nuran'ın etkisiyle kendi düşüncelerini özgürce ifade etme arzusunu keşfederken, içsel şeytanıyla ve toplumun baskısıyla mücadele ederek, kendi kimliğini bulma yolculuğuna çıkar.\n" +
            "\n" +
            "Kitap, insanın içindeki çelişkileri, özgür düşüncenin toplum tarafından nasıl bastırıldığını ve bireyin kimlik arayışını ele alır.\n" +
            "\n" +
            "İçimizdeki Şeytan'ı okurken, kendi iç dünyanıza yolculuk yapacak ve Sabahattin Ali'nin dünyasında, içsel çatışmaların karmaşıklığını düşünme ve sorgulama fırsatı bulacaksınız."
    public val Sapiens: String = "Sapiens: \"İnsan Türünün Kısa Bir Tarihi\", Yuval Noah Harari tarafından kaleme alınmış, insanlığın evrimi ve tarihini ele alan, bilimsel araştırmalarla desteklenerek kurgusal anlatımla birleştirilmiş etkileyici bir eserdir.\n" +
            "\n" +
            "Kitap, evrimimizin başlangıcından bugüne kadar olan süreçte nasıl şekillendiğimizi ve dünyamızı nasıl dönüştürdüğümüzü anlamamıza yardımcı olurken, insanlık tarihinin büyük dönüm noktalarını ve insanların dünyayı nasıl şekillendirdiğini inceler.\n" +
            "\n" +
            "Harari, insanların neden diğer türlerden üstün olduğunu araştırırken, Homo sapiens'in evrimini, toplumların oluşumunu ve dünyayı nasıl şekillendirdiğimizi analiz eder. İnsanlığın ortaya çıkışından tarım devrimine, imparatorluklardan bilimsel ve teknolojik ilerlemelere kadar pek çok önemli aşamayı ele alır. Aynı zamanda, dillerin, mitolojilerin, dinlerin ve ekonomik sistemlerin insanların kültürel ve sosyal evrimindeki yerini de inceler.\n" +
            "\n" +
            "Sapiens, okuyuculara düşünme ve sorgulama fırsatı sunar. Harari'nin gözlem ve analizleri, insanlığın geçmişinden geleceğe dair önemli dersler çıkarılmasına yardımcı olur.\n" +
            "\n" +
            "Harari'nin yaptığı bilimsel araştırmaları, sürükleyici anlatımı sayesinde okuyucular tarih boyunca insanların nasıl düşündüğünü, inandıklarını ve dünyayı nasıl değiştirdiklerini daha iyi anlarlar.\n" +
            "\n" +
            "Bu kitap, insan türünün karmaşık ve ilginç tarihini anlatırken, dünyayı anlamamıza ve geleceğimizi şekillendirmemize yardımcı olur.\n" +
            "\n" +
            "Sapiens'i okurken, geçmişimize dair bilgileri keşfedebilir, düşünebilir ve kendi dünyamızı sorgulayabiliriz. Bu unutulmaz eser, tarih, antropoloji ve felsefe meraklılarının mutlaka okuması gereken bir kitaptır. "
    public val Korluk :String = "Jose Saramago'nun Körlük adlı kitabı, ruhsal körlüğün toplumu nasıl bir felakete sürükleyeceğini anlatan etkileyici bir başyapıttır. Bu kitabı okurken, Saramago'nun benzersiz anlatımıyla \"Körlük\" romanını keşfedecek ve insan doğasının karanlık yönlerini sorgulayacaksınız.\n" +
            "\n" +
            "Kitap, beklenmedik bir körlük salgını ile sarsılan bir şehirde geçen hikayeyi anlatır. Bu körlük, hızla yayılır ve insanların sadece beyaz bir sis bulutunu görmelerine neden olur. Bu kaos ortamında, toplumun içgüdüleri ve hayatta kalma mücadelesi ortaya çıkar.\n" +
            "\n" +
            "Kitapta, beyaz körlüğe yakalanan bir grup insanın bir karantina bölgesine hapsedilmesi ve orada yaşadıkları anlatılır. Burada insanlar arasındaki ilişkiler, güç mücadeleleri ve içgüdüsel davranışlar Saramago'nun güçlü anlatımıyla çarpıcı bir şekilde tasvir edilir. Kitap, insan doğasının karanlık yönlerini cesurca tanımlar. Saramago okuyucuları, insanlığın değerlerini kaybederken neler olabileceğini düşünmeye sürükler ve okuyucu, insani değerleri sorgulamaya iter.\n" +
            "\n" +
            "Yazar, şehirde yaşanan bu körlüğün fiziksel bir durum olmadığını, insani değerlerin kaybedilmesi ile ortaya çıkan bir ruhsal körlük olduğunu ve insanlığın karanlık yönlerinin bir yansıması olduğunu anlatır.\n" +
            "\n" +
            "\"Körlük\" romanını okuyarak, insan doğasının derinliklerine inebilir ve insanlık hakkında yeni bakış açıları elde edebilirsiniz."
    public val Sucveceza: String = "Raskolnikov diye bi eleman var bu epey fakirlik çekiyor. Kasaba manava borç takmış sokağa çıkamıyor sonra bi kadını öldürüyor bu ama kadın meğer hikmetli, okunmuş biriymiş bunun ruhu falan epey darlıyor bu çocuğu. Redingot dedikleri bişey var bir de gocuk gibi ama böyle daha çok palto gibi. Altından kıymetli valla redingot aşağı redingot yukarı sayfalarca gocuk muhabbeti var kitapta."
    public val Hayvanmezarligi:String = "Bi aile var çocuklu kedili falan. Bunlar bi köye taşınıyo ama köy meğer cinli ruhlu bi köymüş. Kadın annesine mantı açmaya gittiği bi gün kediye kamyon çarpıyo sonra bahçıvanla beraber adam bunu gömüyor. Ama meğer gömdükleri yer evliya mezarıymış sen kedi bi canlan bunlara saldır. Cırmık içinde bırakıyor hepsini. Öleni gömüyolar oraya, e gömme be kardeşim işte niye rahatsız ediyosun elin cinini şeytanını. Sonra kedi çocuğu, çocuk bahçıvanı, sonra yine çocuk kadını, kadın adamı öldürüyor derken hepsi mevta oluyor epey anlamsız bi kitap."

}