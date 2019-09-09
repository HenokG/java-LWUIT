//Programmer Henok G
//First Modified Date July-6-2015
//Last Modified Date August-15-2015
//Application Completed Date August-15-2015

import javax.microedition.midlet.MIDlet;
import com.sun.lwuit.*;
import com.sun.lwuit.events.*;
import com.sun.lwuit.layouts.GridLayout;
import com.sun.lwuit.animations.*;
import java.io.IOException;


public class Fetan extends MIDlet {
    
    protected void showPhoneList(int id){
        try {
            Form listsForm = new Form("ለመደወል \"ok\"ን ይጫኑ");
            listsForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
            Image backgroundImage4AllLists = Image.createImage("background.png");
            Command backCommand4Fun = new Command("ተመለስ"){public void actionPerformed(ActionEvent ae){funForm();}};
            Command backCommand4emergeny = new Command("ተመለስ"){public void actionPerformed(ActionEvent ae){emergencyForm();}};
            Command backCommand4important = new Command("ተመለስ"){public void actionPerformed(ActionEvent ae){importantForm();}};
            Command backCommand4finance = new Command("ተመለስ"){public void actionPerformed(ActionEvent ae){financeForm();}};
            //For Hospitals
            if (id==1) {
                Button ambulance = new Button("\u12A0\u121D\u1261\u120B\u1295\u1235");
                ambulance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ambulance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ambulance);} catch (Exception ex) {}}});
                
                Button addisKardiak = new Button("አዲስ ካርዲያክ ሆስፒታል");
                addisKardiak.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                addisKardiak.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.addisKardiak);} catch (Exception ex) {}}});
                
                Button addisHiwot = new Button("አዲስ ሕይወት ሆስፒታል");
                addisHiwot.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                addisHiwot.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.addisHiwot);} catch (Exception ex) {}}});
                
                Button alert = new Button("አለርት ሆስፒታል");
                alert.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                alert.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.alert);} catch (Exception ex) {}}});
                
                Button amanuel = new Button("አማኑኤል ሆስፒታል");
                amanuel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                amanuel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.amanuel);} catch (Exception ex) {}}});
                
                Button asegedech = new Button("አሰገደች ሆስፒታል");
                asegedech.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                asegedech.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.asegedech);} catch (Exception ex) {}}});
                
                Button torHayloch = new Button("ጦር ኃይሎች ሆስፒታል");
                torHayloch.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                torHayloch.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.torHayloch);} catch (Exception ex) {}}});
                
                Button beteZata = new Button("ቤተዛታ ሆስፒታል");
                beteZata.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                amanuel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.beteZata);} catch (Exception ex) {}}});
                
                Button betel = new Button("ቤቴል ሆስፒታል");
                betel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                betel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.betel);} catch (Exception ex) {}}});
                
                Button betsegah = new Button("በጸጋህ ሆስፒታል");
                betsegah.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                betsegah.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.betsegah);} catch (Exception ex) {}}});
                
                Button bgm = new Button("ቢ ጂ ኤም ሆስፒታል");
                bgm.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                bgm.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.bgm);} catch (Exception ex) {}}});
                
                Button tikurAnbessa = new Button("ጥቁር አንበሳ ሆስፒታል");
                tikurAnbessa.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                tikurAnbessa.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.tikurAnbessa);} catch (Exception ex) {}}});
                
                Button biras = new Button("ብራስ ሆስፒታል");
                biras.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                biras.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.biras);} catch (Exception ex) {}}});
                
                Button cureEthiopia = new Button("ኪዩር ኢትዮጲያ ሆስፒታል");
                cureEthiopia.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                cureEthiopia.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.cureEthiopia);} catch (Exception ex) {}}});
                
                Button degachBalcha = new Button("ደጃች ባልቻ ሆስፒታል");
                degachBalcha.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                degachBalcha.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.degachBalcha);} catch (Exception ex) {}}});
                
                Button dinberua = new Button("ድንበሩ ሆስፒታል");
                dinberua.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                dinberua.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.dinberua);} catch (Exception ex) {}}});
                
                Button ethioTibeb = new Button("ኢትዮ ጥበብ ሆስፒታል");
                ethioTibeb.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethioTibeb.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethioTibeb);} catch (Exception ex) {}}});
                
                Button internationalCardiovascular = new Button("ኢንተርናሽናል ካርዲዮቫስኩላር ሆስፒታል");
                internationalCardiovascular.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                internationalCardiovascular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.internationalCardiovascular);} catch (Exception ex) {}}});
                
                Button festula = new Button("ፊስቱላ ሆስፒታል");
                festula.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                festula.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.festula);} catch (Exception ex) {}}});
                
                Button ganide = new Button("ጋንዲ ሆስፒታል");
                ganide.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ganide.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ganide);} catch (Exception ex) {}}});
                
                Button girum = new Button("ግሩም ሆስፒታል");
                girum.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                girum.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.girum);} catch (Exception ex) {}}});
                
                Button hayat = new Button("ሃያት ሆስፒታል");
                hayat.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                hayat.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.hayat);} catch (Exception ex) {}}});
                
                Button kadisko = new Button("ካዲስኮ ሆስፒታል");
                kadisko.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kadisko.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kadisko);} catch (Exception ex) {}}});
                
                Button landmark = new Button("ላንድማርክ ሆስፒታል");
                landmark.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                landmark.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.landmark);} catch (Exception ex) {}}});
                
                Button minelek2 = new Button("ሚኒሊክ 2 ሆስፒታል");
                minelek2.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                minelek2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.minelek2);} catch (Exception ex) {}}});
                
                Button mmd = new Button("ኤም ኤም ዲ ሆስፒታል");
                mmd.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                mmd.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.mmd);} catch (Exception ex) {}}});
                
                Button mcmEthioKorea = new Button("ኤም ሲ ኤም ኢትዮ ኮርያ ሆስፒታል");
                mcmEthioKorea.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                mcmEthioKorea.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.mcmEthioKorea);} catch (Exception ex) {}}});
                
                Button nazrawet = new Button("ናዝራዊት ሆስፒታል");
                nazrawet.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nazrawet.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nazrawet);} catch (Exception ex) {}}});
                
                Button police = new Button("ፖሊስ ሆስፒታል");
                police.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                police.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.police);} catch (Exception ex) {}}});
                
                Button rasDeseta = new Button("ራስ ደስታ ሆስፒታል");
                rasDeseta.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                rasDeseta.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.rasDeseta);} catch (Exception ex) {}}});
                
                Button kidusGebreal = new Button("ቅዱስ ገብርኤል ሆስፒታል");
                kidusGebreal.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kidusGebreal.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kidusGebreal);} catch (Exception ex) {}}});
                
                Button kidusPawlos = new Button("ቅዱስ ጳውሎስ ሆስፒታል");
                kidusPawlos.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kidusPawlos.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kidusPawlos);} catch (Exception ex) {}}});
                
                Button kidusPetros = new Button("ቅዱስ ጴጥሮስ ሆስፒታል");
                kidusPetros.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kidusPetros.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kidusPetros);} catch (Exception ex) {}}});
                
                Button kidusYared = new Button("ቅዱስ ያሬድ ሆስፒታል");
                kidusYared.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kidusYared.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kidusYared);} catch (Exception ex) {}}});
                
                Button tezeniya = new Button("ተዘንያ ሆስፒታል");
                tezeniya.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                tezeniya.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.tezeniya);} catch (Exception ex) {}}});
                
                Button tibebu = new Button("ጥበቡ ሆስፒታል");
                tibebu.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                tibebu.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.tibebu);} catch (Exception ex) {}}});
                
                Button yekatit12 = new Button("የካቲት 12 ሆስፒታል");
                yekatit12.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                yekatit12.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.yekatit12);} catch (Exception ex) {}}});
                
                Button zenbaba = new Button("ዘንባባ ሆስፒታል");
                zenbaba.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                zenbaba.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.zenbaba);} catch (Exception ex) {}}});
                
                Button zewdetu = new Button("ዘውዲቱ ሆስፒታል");
                zewdetu.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                zewdetu.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.zewdetu);} catch (Exception ex) {}}});
                
                listsForm.addComponent(ambulance);
                listsForm.addComponent(addisKardiak);
                listsForm.addComponent(addisHiwot);
                listsForm.addComponent(alert);
                listsForm.addComponent(amanuel);
                listsForm.addComponent(asegedech);
                listsForm.addComponent(torHayloch);
                listsForm.addComponent(beteZata);
                listsForm.addComponent(betel);
                listsForm.addComponent(betsegah);
                listsForm.addComponent(bgm);
                listsForm.addComponent(tikurAnbessa);
                listsForm.addComponent(biras);
                listsForm.addComponent(cureEthiopia);
                listsForm.addComponent(degachBalcha);
                listsForm.addComponent(dinberua);
                listsForm.addComponent(ethioTibeb);
                listsForm.addComponent(internationalCardiovascular);
                listsForm.addComponent(festula);
                listsForm.addComponent(ganide);
                listsForm.addComponent(girum);
                listsForm.addComponent(hayat);
                listsForm.addComponent(kadisko);
                listsForm.addComponent(landmark);
                listsForm.addComponent(minelek2);
                listsForm.addComponent(mmd);
                listsForm.addComponent(mcmEthioKorea);
                listsForm.addComponent(nazrawet);
                listsForm.addComponent(police);
                listsForm.addComponent(rasDeseta);
                listsForm.addComponent(kidusGebreal);
                listsForm.addComponent(kidusPawlos);
                listsForm.addComponent(kidusPetros);
                listsForm.addComponent(kidusYared);
                listsForm.addComponent(tezeniya);
                listsForm.addComponent(tibebu);
                listsForm.addComponent(yekatit12);
                listsForm.addComponent(zenbaba);
                listsForm.addComponent(zewdetu);
                listsForm.addCommand(backCommand4emergeny);
                listsForm.setLayout(new GridLayout(30, 1));
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Police Stations
            else if (id==2) {
                Button polic = new Button("ፖሊስ");
                polic.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                polic.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.polic);} catch (Exception ex) {}}});
                
                Button federalPolice = new Button("ፌደራል ፖሊስ");
                federalPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                federalPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.federalPolice);} catch (Exception ex) {}}});
                
                Button addisAbabaPolice = new Button("አዲስ አበባ ፖሊስ");
                addisAbabaPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                addisAbabaPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.addisAbabaPolice);} catch (Exception ex) {}}});
                
                Button bolePolice = new Button("ቦሌ ፖሊስ");
                bolePolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                bolePolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.bolePolice);} catch (Exception ex) {}}});
                
                Button lidetaPolice = new Button("ልደታ ፖሊስ");
                lidetaPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                lidetaPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.lidetaPolice);} catch (Exception ex) {}}});
                
                Button kirkosPolice = new Button("ቂርቆስ ፖሊስ");
                kirkosPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kirkosPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kirkosPolice);} catch (Exception ex) {}}});
                
                Button aradaPolice = new Button("አራዳ ፖሊስ");
                aradaPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                aradaPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.aradaPolice);} catch (Exception ex) {}}});
                
                Button yekaPolice = new Button("የካ ፖሊስ");
                yekaPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                yekaPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.yekaPolice);} catch (Exception ex) {}}});
                
                Button nifasSilkLaftoPolice = new Button("ንፋስ ስልክ ላፍቶ ፖሊስ");
                nifasSilkLaftoPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nifasSilkLaftoPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nifasSilkLaftoPolice);} catch (Exception ex) {}}});
                
                Button kolfeKeranyoPolice = new Button("ኮልፌ ቀራኒዮ ፖሊስ");
                kolfeKeranyoPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kolfeKeranyoPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kolfeKeranyoPolice);} catch (Exception ex) {}}});
                
                Button akakeKalitiPolice = new Button("አቃቂ ቃሊቲ ፖሊስ");
                akakeKalitiPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                akakeKalitiPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.akakeKalitiPolice);} catch (Exception ex) {}}});
                
                Button addisKetemaPolice = new Button("አዲስ ከተማ ፖሊስ");
                addisKetemaPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                addisKetemaPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.addisKetemaPolice);} catch (Exception ex) {}}});
                
                Button gulelePolice = new Button("ጉለሌ ፖሊስ");
                gulelePolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                gulelePolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.gulelePolice);} catch (Exception ex) {}}});
                
                Button addisAbabaTraficPolice = new Button("አዲስ አበባ ትራፊክ ፖሊስ");
                addisAbabaTraficPolice.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                addisAbabaTraficPolice.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.addisAbabaTraficPolice);} catch (Exception ex) {}}});
                
                listsForm.addComponent(polic);
                listsForm.addComponent(federalPolice);
                listsForm.addComponent(addisAbabaPolice);
                listsForm.addComponent(bolePolice);
                listsForm.addComponent(lidetaPolice);
                listsForm.addComponent(kirkosPolice);
                listsForm.addComponent(aradaPolice);
                listsForm.addComponent(yekaPolice);
                listsForm.addComponent(nifasSilkLaftoPolice);
                listsForm.addComponent(kolfeKeranyoPolice);
                listsForm.addComponent(akakeKalitiPolice);
                listsForm.addComponent(addisKetemaPolice);
                listsForm.addComponent(gulelePolice);
                listsForm.addComponent(addisAbabaTraficPolice);
                listsForm.addCommand(backCommand4emergeny);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Fire Stations
            else if (id==3) {
                Button firstTabiya = new Button("1ኛ ጣቢያ ምኒልክ አደባባይ");
                firstTabiya.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                firstTabiya.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.firstTabiya);} catch (Exception ex) {}}});
                
                Button secondTabiya = new Button("2ኛ ጣቢያ አዲሱ ቄራ");
                secondTabiya.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                secondTabiya.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.secondTabiya);} catch (Exception ex) {}}});
                
                Button thirdTabiya = new Button("3ኛ ጣቢያ መሳለሚያ");
                thirdTabiya.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                thirdTabiya.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.thirdTabiya);} catch (Exception ex) {}}});
                
                Button fourthTabiya = new Button("4ኛ ጣቢያ ንፋስ ስልክ");
                fourthTabiya.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                fourthTabiya.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.fourthTabiya);} catch (Exception ex) {}}});
                
                Button fifthTabiya = new Button("5ኛ ጣቢያ አቃቂ");
                fifthTabiya.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                fifthTabiya.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.fifthTabiya);} catch (Exception ex) {}}});
                
                Button sixthTabiya = new Button("6ኛ ጣቢያ መገናኛ");
                sixthTabiya.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                sixthTabiya.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.sixthTabiya);} catch (Exception ex) {}}});
                
                Button seventhTabiya = new Button("7ኛ ጣቢያ ቦሌ");
                seventhTabiya.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                seventhTabiya.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.seventhTabiya);} catch (Exception ex) {}}});
                
                listsForm.addComponent(firstTabiya);
                listsForm.addComponent(secondTabiya);
                listsForm.addComponent(thirdTabiya);
                listsForm.addComponent(fourthTabiya);
                listsForm.addComponent(fifthTabiya);
                listsForm.addComponent(sixthTabiya);
                listsForm.addComponent(seventhTabiya);
                listsForm.addCommand(backCommand4emergeny);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Hotels
            else if (id==4) {
                Button ambasadorHotel = new Button("አምባሳደር ሆቴል");
                ambasadorHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ambasadorHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ambasadorHotel);} catch (Exception ex) {}}});
                
                Button airportMotel = new Button("አየር መንገድ ሆቴል");
                airportMotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                airportMotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.airportMotel);} catch (Exception ex) {}}});
                
                Button araratHotel = new Button("አራራት ሆቴል");
                araratHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                araratHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.araratHotel);} catch (Exception ex) {}}});
                
                Button atlasIntHotel = new Button("አትላስ ኢንተርናሽናል ሆቴል");
                atlasIntHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                atlasIntHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.atlasIntHotel);} catch (Exception ex) {}}});
                
                Button axumHotel = new Button("አክሱም ሆቴል");
                axumHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                axumHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.axumHotel);} catch (Exception ex) {}}});
                
                Button beshaleHotel = new Button("በሻሌ ሆቴል");
                beshaleHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                beshaleHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.beshaleHotel);} catch (Exception ex) {}}});
                
                Button centralShewaHotel = new Button("ሴንትራል ሸዋ ሆቴል");
                centralShewaHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                centralShewaHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.centralShewaHotel);} catch (Exception ex) {}}});
                
                Button concordHotel = new Button("ኮርኮድ ሆቴል");
                concordHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                concordHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.concordHotel);} catch (Exception ex) {}}});
                
                Button crownHotel = new Button("ክራውን ሆቴል");
                crownHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                crownHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.crownHotel);} catch (Exception ex) {}}});
                
                Button diafriqHotel = new Button("ዲያፍሪቅ ሆቴል");
                diafriqHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                diafriqHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.diafriqHotel);} catch (Exception ex) {}}});
                
                Button dimtriHotel = new Button("ዲሚትሪ ሆቴል");
                dimtriHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                dimtriHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.dimtriHotel);} catch (Exception ex) {}}});
                
                Button desalegnHotel = new Button("ደሳለኝ ሆቴል");
                desalegnHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                desalegnHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.desalegnHotel);} catch (Exception ex) {}}});
                
                Button deleopalHotel = new Button("ዲ ሊኦፓል ሆቴል");
                deleopalHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                deleopalHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.deleopalHotel);} catch (Exception ex) {}}});
                
                Button dreamlinerHotel = new Button("ድሪም ላይነር ሆቴል");
                dreamlinerHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                dreamlinerHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.dreamlinerHotel);} catch (Exception ex) {}}});
                
                Button ethiopiaHotel = new Button("ኢትዮጵያ ሆቴል");
                ethiopiaHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethiopiaHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethiopiaHotel);} catch (Exception ex) {}}});
                
                Button extremeHotel = new Button("ኤክስትሪም ሆቴል");
                extremeHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                extremeHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.extremeHotel);} catch (Exception ex) {}}});
                
                Button genetHotel = new Button("ገነት ሆቴል");
                genetHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                genetHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.genetHotel);} catch (Exception ex) {}}});
                
                Button geonHotel = new Button("ጊዮን ሆቴል");
                geonHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                geonHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.geonHotel);} catch (Exception ex) {}}});
                
                Button globalHotel = new Button("ግሎባል ሆቴል");
                globalHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                globalHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.globalHotel);} catch (Exception ex) {}}});
                
                Button harambeHotel = new Button("ሃራምቤ ሆቴል");
                harambeHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                harambeHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.harambeHotel);} catch (Exception ex) {}}});
                
                Button harmoneyHotel = new Button("ሃርመኒ ሆቴል");
                harmoneyHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                harmoneyHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.harmoneyHotel);} catch (Exception ex) {}}});
                
                Button hiltonHotel = new Button("ሂልተን ሆቴል");
                hiltonHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                hiltonHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.hiltonHotel);} catch (Exception ex) {}}});
                
                Button imperialHotel = new Button("ኢምፔርያል ሆቴል");
                imperialHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                imperialHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.imperialHotel);} catch (Exception ex) {}}});
                
                Button intercontinentalHotel = new Button("ኢንተርኮንቲኔንታል ሆቴል");
                intercontinentalHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                intercontinentalHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.intercontinentalHotel);} catch (Exception ex) {}}});
                
                Button iyerusalemHotel = new Button("እየሩሳሌም ሆቴል");
                iyerusalemHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                iyerusalemHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.iyerusalemHotel);} catch (Exception ex) {}}});
                
                Button jupiterHotel = new Button("ጁፒተር ሆቴል");
                jupiterHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                jupiterHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.jupiterHotel);} catch (Exception ex) {}}});
                
                Button kingsHotel = new Button("ኪንግስ ሆቴል");
                kingsHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kingsHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kingsHotel);} catch (Exception ex) {}}});
                
                Button lalibelaHotel = new Button("ላሊበላ ሆቴል");
                lalibelaHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                lalibelaHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.lalibelaHotel);} catch (Exception ex) {}}});
                
                Button meridianHotel = new Button("መሪድያን ሆቴል");
                meridianHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                meridianHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.meridianHotel);} catch (Exception ex) {}}});
                
                Button nationalHotel = new Button("ናሽናል ሆቴል");
                nationalHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nationalHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nationalHotel);} catch (Exception ex) {}}});
                
                Button plazaHotel = new Button("ፕላዛ ሆቴል");
                plazaHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                plazaHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.plazaHotel);} catch (Exception ex) {}}});
                
                Button nigistesabaHotel = new Button("ንግስት ሳባ ሆቴል");
                nigistesabaHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nigistesabaHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nigistesabaHotel);} catch (Exception ex) {}}});
                
                Button panoramaHotel = new Button("ፓናሮማ ሆቴል");
                panoramaHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                panoramaHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.panoramaHotel);} catch (Exception ex) {}}});
                
                Button rasambaHotel = new Button("ራስ አምባ ሆቴል");
                rasambaHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                rasambaHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.rasambaHotel);} catch (Exception ex) {}}});
                
                Button rasHotel = new Button("ራስ ሆቴል");
                rasHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                rasHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.rasHotel);} catch (Exception ex) {}}});
                
                Button riveraHotel = new Button("ሪቨራ ሆቴል");
                riveraHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                riveraHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.riveraHotel);} catch (Exception ex) {}}});
                
                Button semenHotel = new Button("ሰሜን ሆቴል");
                semenHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                semenHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.semenHotel);} catch (Exception ex) {}}});
                
                Button sheratonHotel = new Button("ሸራተን ሆቴል");
                sheratonHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                sheratonHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.sheratonHotel);} catch (Exception ex) {}}});
                
                Button wabishebeleHotel = new Button("ዋቢ ሸበሌ ሆቴል");
                wabishebeleHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                wabishebeleHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.wabishebeleHotel);} catch (Exception ex) {}}});
                
                Button yoilHotel = new Button("ዮሊ ሆቴል");
                yoilHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                yoilHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.yoilHotel);} catch (Exception ex) {}}});
                
                Button yordanosHotel = new Button("ዮርዳኖስ ሆቴል");
                yordanosHotel.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                yordanosHotel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.yordanosHotel);} catch (Exception ex) {}}});
                
                listsForm.addComponent(ambasadorHotel);
                listsForm.addComponent(airportMotel);
                listsForm.addComponent(araratHotel);
                listsForm.addComponent(atlasIntHotel);
                listsForm.addComponent(axumHotel);
                listsForm.addComponent(beshaleHotel);
                listsForm.addComponent(centralShewaHotel);
                listsForm.addComponent(concordHotel);
                listsForm.addComponent(crownHotel);
                listsForm.addComponent(diafriqHotel);
                listsForm.addComponent(dimtriHotel);
                listsForm.addComponent(desalegnHotel);
                listsForm.addComponent(deleopalHotel);
                listsForm.addComponent(dreamlinerHotel);
                listsForm.addComponent(ethiopiaHotel);
                listsForm.addComponent(extremeHotel);
                listsForm.addComponent(genetHotel);
                listsForm.addComponent(geonHotel);
                listsForm.addComponent(globalHotel);
                listsForm.addComponent(harambeHotel);
                listsForm.addComponent(harmoneyHotel);
                listsForm.addComponent(hiltonHotel);
                listsForm.addComponent(imperialHotel);
                listsForm.addComponent(intercontinentalHotel);
                listsForm.addComponent(iyerusalemHotel);
                listsForm.addComponent(jupiterHotel);
                listsForm.addComponent(kingsHotel);
                listsForm.addComponent(lalibelaHotel);
                listsForm.addComponent(meridianHotel);
                listsForm.addComponent(nationalHotel);
                listsForm.addComponent(plazaHotel);
                listsForm.addComponent(nigistesabaHotel);
                listsForm.addComponent(panoramaHotel);
                listsForm.addComponent(rasambaHotel);
                listsForm.addComponent(rasHotel);
                listsForm.addComponent(riveraHotel);
                listsForm.addComponent(semenHotel);
                listsForm.addComponent(sheratonHotel);
                listsForm.addComponent(wabishebeleHotel);
                listsForm.addComponent(yoilHotel);
                listsForm.addComponent(yordanosHotel);
                listsForm.addCommand(backCommand4Fun);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Cinema
            else if (id==5) {
                Button ambasadorCinema = new Button("አምባሳደር ሲኒማ");
                ambasadorCinema.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ambasadorCinema.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ambasadorCinema);} catch (Exception ex) {}}});
                
                Button megamafitiyatirCinema = new Button("ሜጋ አንፊ ትያትር");
                megamafitiyatirCinema.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                megamafitiyatirCinema.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.megamafitiyatirCinema);} catch (Exception ex) {}}});
                
                Button cityhalCinema = new Button("ሲቲ ሆል ሲኒማ");
                cityhalCinema.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                cityhalCinema.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.cityhalCinema);} catch (Exception ex) {}}});
                
                Button ednamolmatiCinema = new Button("ኤድና ሞል ማቲ ሲኒማ");
                ednamolmatiCinema.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ednamolmatiCinema.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ednamolmatiCinema);} catch (Exception ex) {}}});
                
                Button hagerfikirTiyatir = new Button("ሃገር ፍቅር ትያትር");
                hagerfikirTiyatir.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                hagerfikirTiyatir.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.hagerfikirTiyatir);} catch (Exception ex) {}}});
                
                Button rasTiyatir = new Button("ራስ ትያትር");
                rasTiyatir.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                rasTiyatir.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.rasTiyatir);} catch (Exception ex) {}}});
                
                Button kandiTiyatir = new Button("ካንዲ ትያትር");
                kandiTiyatir.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kandiTiyatir.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kandiTiyatir);} catch (Exception ex) {}}});
                
                Button nisirTiyatirandPromotion = new Button("ንስር ትያትር እና ፕሮሞሽን");
                nisirTiyatirandPromotion.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nisirTiyatirandPromotion.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nisirTiyatirandPromotion);} catch (Exception ex) {}}});
                
                Button alemCinema = new Button("አለም ሲኒማ");
                alemCinema.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                alemCinema.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.alemCinema);} catch (Exception ex) {}}});
                
                Button ligochandwetatochTiyatir = new Button("ልጆች እና ወጣቶች ትያትር");
                ligochandwetatochTiyatir.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ligochandwetatochTiyatir.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ligochandwetatochTiyatir);} catch (Exception ex) {}}});
                
                Button biherawiTiyatir = new Button("ብሄራዊ ትያትር");
                biherawiTiyatir.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                biherawiTiyatir.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.biherawiTiyatir);} catch (Exception ex) {}}});
                
                Button agonaCinema = new Button("አጎና ሲኒማ");
                agonaCinema.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                agonaCinema.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.agonaCinema);} catch (Exception ex) {}}});
                
                listsForm.addComponent(ambasadorCinema);
                listsForm.addComponent(megamafitiyatirCinema);
                listsForm.addComponent(cityhalCinema);
                listsForm.addComponent(ednamolmatiCinema);
                listsForm.addComponent(hagerfikirTiyatir);
                listsForm.addComponent(rasTiyatir);
                listsForm.addComponent(kandiTiyatir);
                listsForm.addComponent(nisirTiyatirandPromotion);
                listsForm.addComponent(alemCinema);
                listsForm.addComponent(ligochandwetatochTiyatir);
                listsForm.addComponent(biherawiTiyatir);
                listsForm.addComponent(agonaCinema);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.addCommand(backCommand4Fun);
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Bank
            else if (id==6) {
                Button abayBank = new Button("አባይ ባንክ");
                abayBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                abayBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.abayBank);} catch (Exception ex) {}}});
                
                Button adisintBank = new Button("አዲስ ኢንት ባንክ");
                adisintBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                adisintBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.adisintBank);} catch (Exception ex) {}}});
                
                Button awashintBank = new Button("አዋሽ ኢንት ባንክ");
                awashintBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                awashintBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.awashintBank);} catch (Exception ex) {}}});
                
                Button abysinyaBank = new Button("አቢሲኒያ ባንክ");
                abysinyaBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                abysinyaBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.abysinyaBank);} catch (Exception ex) {}}});
                
                Button birhanintBank = new Button("ብርሃን ኢንት ባንክ");
                birhanintBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                birhanintBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.birhanintBank);} catch (Exception ex) {}}});
                
                Button bunaintBank = new Button("ቡና ኢንት ባንክ");
                bunaintBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                bunaintBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.bunaintBank);} catch (Exception ex) {}}});
                
                Button coporomiaBank = new Button("ኮፕ ኦሮሚያ ባንክ");
                coporomiaBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                coporomiaBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.coporomiaBank);} catch (Exception ex) {}}});
                
                Button nigidBank = new Button("ንግድ ባንክ");
                nigidBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nigidBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nigidBank);} catch (Exception ex) {}}});
                
                Button constructionandbusinessBank = new Button("ኮንስትራክሽን እና ቢዝነስ ባንክ");
                constructionandbusinessBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                constructionandbusinessBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.constructionandbusinessBank);} catch (Exception ex) {}}});
                
                Button dashenBank = new Button("ዳሽን ባንክ");
                dashenBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                dashenBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.dashenBank);} catch (Exception ex) {}}});
                
                Button developmentBank = new Button("ዴቨሎፕመንት ባንክ");
                developmentBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                developmentBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.developmentBank);} catch (Exception ex) {}}});
                
                Button debubglobalBank = new Button("ደቡብ ግሎባል ባንክ");
                debubglobalBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                debubglobalBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.debubglobalBank);} catch (Exception ex) {}}});
                
                Button inatBank = new Button("እናት ባንክ");
                inatBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                inatBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.inatBank);} catch (Exception ex) {}}});
                
                Button anbessaintBank = new Button("አንበሳ ኢንት ባንክ");
                anbessaintBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                anbessaintBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.anbessaintBank);} catch (Exception ex) {}}});
                
                Button nibintBank = new Button("ንብ ኢንት ባንክ");
                nibintBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nibintBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nibintBank);} catch (Exception ex) {}}});
                
                Button nationalBank = new Button("ናሽናል ባንክ");
                nationalBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nationalBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nationalBank);} catch (Exception ex) {}}});
                
                Button oromiaintBank = new Button("ኦሮሚያ ኢንት ባንክ");
                oromiaintBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                oromiaintBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.oromiaintBank);} catch (Exception ex) {}}});
                
                Button hibretBank = new Button("ህብረት ባንክ");
                hibretBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                hibretBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.hibretBank);} catch (Exception ex) {}}});
                
                Button wegagenBank = new Button("ወጋገን ባንክ");
                wegagenBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                wegagenBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.wegagenBank);} catch (Exception ex) {}}});
                
                Button zemenBank = new Button("ዘመን ባንክ");
                zemenBank.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                zemenBank.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.zemenBank);} catch (Exception ex) {}}});
                
                listsForm.addComponent(abayBank);
                listsForm.addComponent(adisintBank);
                listsForm.addComponent(awashintBank);
                listsForm.addComponent(abysinyaBank);
                listsForm.addComponent(birhanintBank);
                listsForm.addComponent(bunaintBank);
                listsForm.addComponent(coporomiaBank);
                listsForm.addComponent(nigidBank);
                listsForm.addComponent(constructionandbusinessBank);
                listsForm.addComponent(dashenBank);
                listsForm.addComponent(developmentBank);
                listsForm.addComponent(debubglobalBank);
                listsForm.addComponent(inatBank);
                listsForm.addComponent(anbessaintBank);
                listsForm.addComponent(nibintBank);
                listsForm.addComponent(nationalBank);
                listsForm.addComponent(oromiaintBank);
                listsForm.addComponent(hibretBank);
                listsForm.addComponent(wegagenBank);
                listsForm.addComponent(zemenBank);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.addCommand(backCommand4finance);
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Airport
            else if (id==7) {
                Button ethiopiaAirport = new Button("የኢትዮጵያ አየር መንገድ");
                ethiopiaAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethiopiaAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethiopiaAirport);} catch (Exception ex) {}}});
                
                Button kenyanAirport = new Button("የኬንያ አየር መንገድ");
                kenyanAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kenyanAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kenyanAirport);} catch (Exception ex) {}}});
                
                Button egyptAirport = new Button("የግብፅ አየር መንገድ");
                egyptAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                egyptAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.egyptAirport);} catch (Exception ex) {}}});
                
                Button saudiAirport = new Button("የሳኡዲ አየር መንገድ");
                saudiAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                saudiAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.saudiAirport);} catch (Exception ex) {}}});
                
                Button yemenAirport = new Button("የየመን አየር መንገድ");
                yemenAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                yemenAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.yemenAirport);} catch (Exception ex) {}}});
                
                Button emiratesAirport = new Button("ኢምሬትስ አየር መንገድ");
                emiratesAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                emiratesAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.emiratesAirport);} catch (Exception ex) {}}});
                
                Button bmiAirport = new Button("ቢ ኤም አይ አየር መንገድ");
                bmiAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                bmiAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.bmiAirport);} catch (Exception ex) {}}});
                
                Button klmroyaldechAirport = new Button("ኬ ኤል ኤም ሮያል ደች አየር መንገድ");
                klmroyaldechAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                klmroyaldechAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.klmroyaldechAirport);} catch (Exception ex) {}}});
                
                Button lufthansaAirport = new Button("ሉፍታንዛ አየር መንገድ");
                lufthansaAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                lufthansaAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.lufthansaAirport);} catch (Exception ex) {}}});
                
                Button turkAirport = new Button("ቱርክ አየር መንገድ");
                turkAirport.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                turkAirport.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.turkAirport);} catch (Exception ex) {}}});
                
                listsForm.addComponent(ethiopiaAirport);
                listsForm.addComponent(kenyanAirport);
                listsForm.addComponent(egyptAirport);
                listsForm.addComponent(saudiAirport);
                listsForm.addComponent(yemenAirport);
                listsForm.addComponent(emiratesAirport);
                listsForm.addComponent(bmiAirport);
                listsForm.addComponent(klmroyaldechAirport);
                listsForm.addComponent(lufthansaAirport);
                listsForm.addComponent(turkAirport);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.addCommand(backCommand4important);
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Insurance
            else if (id==8) {
                Button abayInsurance = new Button("አባይ ኢንሹራንስ");
                abayInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                abayInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.abayInsurance);} catch (Exception ex) {}}});
                
                Button awashinsurance = new Button("አዋሽ ኢንሹራንስ");
                awashinsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                awashinsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.awashinsurance);} catch (Exception ex) {}}});
                
                Button africaInsurance = new Button("አፍሪካ ኢንሹራንስ");
                africaInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                africaInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.africaInsurance);} catch (Exception ex) {}}});
                
                Button birhanInsurance = new Button("ብርሃን ኢንሹራንስ");
                birhanInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                birhanInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.birhanInsurance);} catch (Exception ex) {}}});
                
                Button ethiopianInsuranceCorp = new Button("የኢትዮጵያ ኢንሹራንስ ኮርፕ");
                ethiopianInsuranceCorp.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethiopianInsuranceCorp.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethiopianInsuranceCorp);} catch (Exception ex) {}}});
                
                Button ethiopianLifeInsurance = new Button("የኢትዮጵያ ላይፍ ኢንሹራንስ");
                ethiopianLifeInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethiopianLifeInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethiopianLifeInsurance);} catch (Exception ex) {}}});
                
                Button globalInsurance = new Button("ግሎባል ኢንሹራንስ");
                globalInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                globalInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.globalInsurance);} catch (Exception ex) {}}});
                
                Button anbessaInsurance = new Button("አንበሳ ኢንሹራንስ");
                anbessaInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                anbessaInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.anbessaInsurance);} catch (Exception ex) {}}});
                
                Button niceInsurance = new Button("ናይስ ኢንሹራንስ");
                niceInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                niceInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.niceInsurance);} catch (Exception ex) {}}});
                
                Button nileInsurance = new Button("ናይል ኢንሹራንስ");
                nileInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nileInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nileInsurance);} catch (Exception ex) {}}});
                
                Button nyalaInsurance = new Button("ኒያላ ኢንሹራንስ");
                nyalaInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nyalaInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nyalaInsurance);} catch (Exception ex) {}}});
                
                Button nibInsurance = new Button("ንብ ኢንሹራንስ");
                nibInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nibInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nibInsurance);} catch (Exception ex) {}}});
                
                Button oromiaInsurance = new Button("ኦሮሚያ ኢንሹራንስ");
                oromiaInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                oromiaInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.oromiaInsurance);} catch (Exception ex) {}}});
                
                Button sunInsurance = new Button("ሰን ኢንሹራንስ");
                sunInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                sunInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.sunInsurance);} catch (Exception ex) {}}});
                
                Button hibretInsurance = new Button("ህብረት ኢንሹራንስ");
                hibretInsurance.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                hibretInsurance.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.hibretInsurance);} catch (Exception ex) {}}});
                
                listsForm.addComponent(abayInsurance);
                listsForm.addComponent(awashinsurance);
                listsForm.addComponent(africaInsurance);
                listsForm.addComponent(birhanInsurance);
                listsForm.addComponent(ethiopianInsuranceCorp);
                listsForm.addComponent(ethiopianLifeInsurance);
                listsForm.addComponent(globalInsurance);
                listsForm.addComponent(anbessaInsurance);
                listsForm.addComponent(niceInsurance);
                listsForm.addComponent(nileInsurance);
                listsForm.addComponent(nyalaInsurance);
                listsForm.addComponent(nibInsurance);
                listsForm.addComponent(oromiaInsurance);
                listsForm.addComponent(sunInsurance);
                listsForm.addComponent(hibretInsurance);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.addCommand(backCommand4finance);
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Media
            else if (id==9) {
                Button ethiopianzenaagelgelot = new Button("የኢትዮጵያ ዜና አገልግሎት");
                ethiopianzenaagelgelot.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethiopianzenaagelgelot.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethiopianzenaagelgelot);} catch (Exception ex) {}}});
                
                Button erta = new Button("የኢትዮጵያ ሬድዮና ቴሌቪዥን ድርጅት");
                erta.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                erta.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.erta);} catch (Exception ex) {}}});
                
                Button fbc = new Button("ፋና ብሮድካስት ኮርፖሬት");
                fbc.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                fbc.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.fbc);} catch (Exception ex) {}}});
                
                Button ethiopiapressorg = new Button("የኢትዮጵያ ፕሬስ ድርጅት");
                ethiopiapressorg.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethiopiapressorg.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethiopiapressorg);} catch (Exception ex) {}}});
                
                Button waltainformationcenter = new Button("ዋልታ ኢንፎርሜሽን ሴንተር");
                waltainformationcenter.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                waltainformationcenter.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.waltainformationcenter);} catch (Exception ex) {}}});
                
                Button fm97 = new Button("ኤፍ ኤም 97");
                fm97.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                fm97.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.fm97);} catch (Exception ex) {}}});
                
                Button fanafm = new Button("ፋና ኤፍ ኤም");
                fanafm.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                fanafm.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.fanafm);} catch (Exception ex) {}}});
                
                Button shegerfm = new Button("ሸገር ኤፍ ኤም");
                shegerfm.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                shegerfm.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.shegerfm);} catch (Exception ex) {}}});
                
                Button afrofm = new Button("እፍሮ ኤፍ ኤም");
                afrofm.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                afrofm.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.afrofm);} catch (Exception ex) {}}});
                
                listsForm.addComponent(ethiopianzenaagelgelot);
                listsForm.addComponent(erta);
                listsForm.addComponent(fbc);
                listsForm.addComponent(ethiopiapressorg);
                listsForm.addComponent(waltainformationcenter);
                listsForm.addComponent(fm97);
                listsForm.addComponent(fanafm);
                listsForm.addComponent(shegerfm);
                listsForm.addComponent(afrofm);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.addCommand(backCommand4Fun);
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Transport
            else if (id==0) {
                Button anbessaBus = new Button("አንበሳ ባስ");
                anbessaBus.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                anbessaBus.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.anbessaBus);} catch (Exception ex) {}}});
                
                Button ethiodjibotiRailway = new Button("ኢትዮ ጅቡቲ ባቡር");
                ethiodjibotiRailway.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethiodjibotiRailway.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethiodjibotiRailway);} catch (Exception ex) {}}});
                
                Button ethiopiashippingShip = new Button("ኢትዮጵያ ሺፒንግ");
                ethiopiashippingShip.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ethiopiashippingShip.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ethiopiashippingShip);} catch (Exception ex) {}}});
                
                Button ntotaxiService = new Button("ታክሲ ሰርቪስ (NTO)");
                ntotaxiService.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                ntotaxiService.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.ntotaxiService);} catch (Exception ex) {}}});
                
                listsForm.addComponent(anbessaBus);
                listsForm.addComponent(ethiodjibotiRailway);
                listsForm.addComponent(ethiopiashippingShip);
                listsForm.addComponent(ntotaxiService);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.addCommand(backCommand4important);
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
            //For Libraries
            else if (id==10) {
                Button kennedyLib = new Button("ኬኔዲ ቤተ መፅሀፍ");
                kennedyLib.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                kennedyLib.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.kennedyLib);} catch (Exception ex) {}}});
                
                Button britishCouncil = new Button("ብሪትሽ ካውንስል");
                britishCouncil.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                britishCouncil.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.britishCouncil);} catch (Exception ex) {}}});
                
                Button nationalLib = new Button("ናሽናል ቤተ መፅሀፍ");
                nationalLib.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                nationalLib.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.nationalLib);} catch (Exception ex) {}}});
                
                Button italianculturalInstitute = new Button("ኢጣልያን ካልቸራል ኢንስቲትዩት");
                italianculturalInstitute.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                italianculturalInstitute.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.italianculturalInstitute);} catch (Exception ex) {}}});
                
                Button acadofethiopianLanguage = new Button("አካዳሚ ኦፍ ኢትዮጵያን ላንጉጅ");
                acadofethiopianLanguage.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                acadofethiopianLanguage.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.acadofethiopianLanguage);} catch (Exception ex) {}}});
                
                Button addisLib = new Button("አዲስ ቤተ መፅሀፍ");
                addisLib.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                addisLib.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.addisLib);} catch (Exception ex) {}}});
                
                Button alianceethioFransic = new Button("አላየንስ ኢትዮ ፍራንስስ");
                alianceethioFransic.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                alianceethioFransic.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.alianceethioFransic);} catch (Exception ex) {}}});
                
                Button germanculturalInstitute = new Button("ጀርመን ካልቸራል ኢንስቲትዩት");
                germanculturalInstitute.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                germanculturalInstitute.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.germanculturalInstitute);} catch (Exception ex) {}}});
                
                Button addisababapublicLib = new Button("አዲስ አበባ የሕዝብ ቤተ መፅሀፍ");
                addisababapublicLib.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE), true);
                addisababapublicLib.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
                    callTo(FetanOperations.addisababapublicLib);} catch (Exception ex) {}}});
                
                listsForm.addComponent(kennedyLib);
                listsForm.addComponent(britishCouncil);
                listsForm.addComponent(nationalLib);
                listsForm.addComponent(italianculturalInstitute);
                listsForm.addComponent(acadofethiopianLanguage);
                listsForm.addComponent(addisLib);
                listsForm.addComponent(alianceethioFransic);
                listsForm.addComponent(germanculturalInstitute);
                listsForm.addComponent(addisababapublicLib);
                listsForm.setLayout(new GridLayout(15, 1));
                listsForm.addCommand(backCommand4important);
                listsForm.setBgImage(backgroundImage4AllLists);
                listsForm.show();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    protected void callTo(String phoneNumber){
        try{
            platformRequest("tel:"+phoneNumber);
            System.out.println("Called To "+phoneNumber);
        }
        catch(Exception e){
            System.out.println("Call To Is The Problem");
        }
    }
    
    protected void rechargeForm(){
        try{
                    Image backgroundImage = Image.createImage("background.png");

        Form rechargeForm = new Form("\u1260\u12AB\u122D\u12F1 \u120B\u12ED"
                + " \u12E8\u121A\u1218\u1208\u12A8\u1271\u1275\u1295 \u1241\u1325\u122D \u12EB\u1235\u1308\u1261");
        rechargeForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
        final TextField cardNumberField = new TextField("33", 18);
        cardNumberField.setConstraint(TextField.NUMERIC);
        cardNumberField.setInputModeOrder(new String[] {"123"});
        cardNumberField.setMaxSize(16);
        rechargeForm.addComponent(cardNumberField);
        Command rechargeCommand = new Command("ሂሳቦን ይሙሉ"){public void actionPerformed(ActionEvent ae){
        callTo(FetanOperations.rechargePrefix+cardNumberField.getText()+FetanOperations.suffix);}};
            Command backtomain = new Command("\u1270\u1218\u1208\u1235"){public void actionPerformed(ActionEvent ae){startApp();}};

        rechargeForm.addCommand(rechargeCommand);
        rechargeForm.addCommand(backtomain);
        rechargeForm.setBgImage(backgroundImage);
        rechargeForm.show();
        }
        catch(Exception e){
            System.out.println("Recharge bro");
        }
    }
    
    public void transferForm(){
        try{
        Image backgroundImage = Image.createImage("background.png");
        Form transferForm = new Form("\u1202\u1233\u1266\u1295 \u12EB\u1235\u1270\u120B\u120D\u1349");
        transferForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
        final TextField phoneNumberField = new TextField("\u12C8\u12F0",12);
        phoneNumberField.setMaxSize(10);
        phoneNumberField.setConstraint(TextField.NUMERIC);
        phoneNumberField.setInputModeOrder(new String[] {"123"});
        final TextField transferRateField = new TextField("\u12ED\u1205\u1295 \u12EB\u1205\u120D",12);
        transferRateField.setMaxSize(4);
        transferRateField.setConstraint(TextField.NUMERIC);
        transferRateField.setInputModeOrder(new String[] {"123"});
        Command transferCommand = new Command("ሂሳቦን ያስተላልፉ"){public void actionPerformed(ActionEvent ae){
        callTo(FetanOperations.transferPrefix+phoneNumberField.getText()+"*"+transferRateField.getText()+FetanOperations.suffix);}};
        Command backtomain = new Command("\u1270\u1218\u1208\u1235"){public void actionPerformed(ActionEvent ae){startApp();}};

        transferForm.addComponent(phoneNumberField);
        transferForm.addComponent(transferRateField);
        transferForm.addCommand(transferCommand);
        transferForm.addCommand(backtomain);
        transferForm.setBgImage(backgroundImage);
        transferForm.show();
         }
        catch(Exception e){
            System.out.println("tran bro");
        }
    }
    
    public void callMeBackForm(){
        try{
        Image backgroundImage = Image.createImage("background.png");
        Form callMeBackForm = new Form("\u1218\u120D\u1230\u12CD \u12ED\u12F0\u12CD\u1209\u120D\u129D");
        callMeBackForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
        final TextField phoneNumberField = new TextField("\u1208",12);
        phoneNumberField.setMaxSize(10);
        phoneNumberField.setConstraint(TextField.NUMERIC);
        phoneNumberField.setInputModeOrder(new String[] {"123"});  
        Command sendCommand = new Command("መልእክቱን ይላኩ"){public void actionPerformed(ActionEvent ae){
        callTo(FetanOperations.callMeBackPrefix+phoneNumberField.getText()+FetanOperations.suffix);}};
        Command backtomain = new Command("\u1270\u1218\u1208\u1235"){public void actionPerformed(ActionEvent ae){startApp();}};

        callMeBackForm.addComponent(phoneNumberField);
        callMeBackForm.addCommand(sendCommand);
        callMeBackForm.addCommand(backtomain);
        callMeBackForm.setBgImage(backgroundImage);
        callMeBackForm.show();
         }
        catch(Exception e){
            System.out.println("call bro");
        }
    }
    
    public void aboutMe(){
        Form aboutMe = new Form();
        aboutMe.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
        try {
            Image myImage = Image.createImage("aboutme.png");
            aboutMe.setBgImage(myImage);
        }
        catch (Exception e) {
        	System.out.println("Henok"+e);
        }
        Command backtomain = new Command("\u1270\u1218\u1208\u1235"){public void actionPerformed(ActionEvent ae){startApp();}};
        TextArea narration = new TextArea("\"\u1348\u1323\u1295\" Is Developed By Henok G. a 2nd Year Software Engineering"
                + " Student at AAIT and an Employee at Roha Software Solutions.\n I hope you will enjoy"
                + " This Fantastic App. If you like this app or there is any problem or wrong information in this application please let me know "
                + "by dialing 0920751501 or email me at hhenok1987@gmail.com. Thanks in advance for your effort and cooperation on using this app.#HenokG");
        narration.getSelectedStyle().setBgTransparency(0);
        narration.getSelectedStyle().setBorder(null);
        narration.getSelectedStyle().setFgColor(0xffffff);
        narration.setEditable(false);
        aboutMe.addComponent(narration);
        aboutMe.addCommand(backtomain);
        aboutMe.show();
    }
    
    public void funForm(){
        Form funForm = new Form();
        funForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
        Command backCommand = new Command("ተመለስ"){public void actionPerformed(ActionEvent ae){startApp();}};
        try {
           Image bgImage = Image.createImage("background.png");
           Image hotelImage = Image.createImage("green.png");
           Image cinemaImage = Image.createImage("yellow.png");
           Image mediaImage = Image.createImage("red.png");
           funForm.setBgImage(bgImage);
            
            Button hotelButton = new Button("ሆቴል", hotelImage);
            Button cinemaButton = new Button("ሲኒማ", cinemaImage);
            Button mediaButton = new Button("መገናኛ ብዙሃን", mediaImage);
            funForm.setLayout(new GridLayout(1, 3));
            
            hotelButton.setTextPosition(Component.BOTTOM);
            cinemaButton.setTextPosition(Component.BOTTOM);
            mediaButton.setTextPosition(Component.BOTTOM);
            
            hotelButton.getStyle().setBgTransparency(0, true);
            cinemaButton.getStyle().setBgTransparency(0, true);
            mediaButton.getStyle().setBgTransparency(0, true);

            hotelButton.getSelectedStyle().setBgTransparency(170);
            hotelButton.getSelectedStyle().setBorder(null);
            cinemaButton.getSelectedStyle().setBgTransparency(170);
            cinemaButton.getSelectedStyle().setBorder(null);
            mediaButton.getSelectedStyle().setBgTransparency(170);
            mediaButton.getSelectedStyle().setBorder(null);

            hotelButton.getStyle().setFgColor(0xffffff);
            cinemaButton.getStyle().setFgColor(0xffffff);
            mediaButton.getStyle().setFgColor(0xffffff);

            hotelButton.getUnselectedStyle().setBorder(null, true);
            cinemaButton.getUnselectedStyle().setBorder(null, true);
            mediaButton.getUnselectedStyle().setBorder(null, true);

            hotelButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
            cinemaButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
            mediaButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);

            hotelButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(4);} catch (Exception ex) {}}});
            cinemaButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(5);} catch (Exception ex) {}}});
            mediaButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(9);} catch (Exception ex) {}}});

            funForm.addComponent(hotelButton);    
            funForm.addComponent(cinemaButton);    
            funForm.addComponent(mediaButton);
            funForm.setLayout(new GridLayout(3,3));
            funForm.addCommand(backCommand);
            funForm.show();
        } catch (Exception e) {System.out.println("henok "+e);}
    }
    
    public void emergencyForm(){
        Form emergencyForm = new Form();
        emergencyForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
        Command backCommand = new Command("ተመለስ"){public void actionPerformed(ActionEvent ae){startApp();}};
        try {
           Image bgImage = Image.createImage("background.png");
           Image policeImage = Image.createImage("green.png");
           Image hospitalImage = Image.createImage("yellow.png");
           Image fireImage = Image.createImage("red.png");
           emergencyForm.setBgImage(bgImage);
            
            Button policeButton = new Button("ፖሊስ", policeImage);
            Button hospitalButton = new Button("ሆስፒታል", hospitalImage);
            Button fireButton = new Button("እሳት አደጋ", fireImage);
            emergencyForm.setLayout(new GridLayout(1, 3));
            
            policeButton.setTextPosition(Component.BOTTOM);
            hospitalButton.setTextPosition(Component.BOTTOM);
            fireButton.setTextPosition(Component.BOTTOM);
            
            policeButton.getStyle().setBgTransparency(0, true);
            hospitalButton.getStyle().setBgTransparency(0, true);
            fireButton.getStyle().setBgTransparency(0, true);

            policeButton.getSelectedStyle().setBgTransparency(170);
            policeButton.getSelectedStyle().setBorder(null);
            hospitalButton.getSelectedStyle().setBgTransparency(170);
            hospitalButton.getSelectedStyle().setBorder(null);
            fireButton.getSelectedStyle().setBgTransparency(170);
            fireButton.getSelectedStyle().setBorder(null);

            policeButton.getStyle().setFgColor(0xffffff);
            hospitalButton.getStyle().setFgColor(0xffffff);
            fireButton.getStyle().setFgColor(0xffffff);

            policeButton.getUnselectedStyle().setBorder(null, true);
            hospitalButton.getUnselectedStyle().setBorder(null, true);
            fireButton.getUnselectedStyle().setBorder(null, true);

            policeButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
            hospitalButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
            fireButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);

            policeButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(2);} catch (Exception ex) {}}});
            hospitalButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(1);} catch (Exception ex) {}}});
            fireButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(3);} catch (Exception ex) {}}});

            emergencyForm.addComponent(policeButton);    
            emergencyForm.addComponent(hospitalButton);    
            emergencyForm.addComponent(fireButton);  
            emergencyForm.setLayout(new GridLayout(3,3));
            emergencyForm.addCommand(backCommand);
            emergencyForm.show();
        } catch (Exception e) {System.out.println("henok "+e);}
    }

    public void importantForm(){
        Form importantForm = new Form();
        importantForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
        Command backCommand = new Command("ተመለስ"){public void actionPerformed(ActionEvent ae){startApp();}};
        try {
           Image bgImage = Image.createImage("background.png");
           Image airportImage = Image.createImage("green.png");
           Image transportImage = Image.createImage("yellow.png");
           Image libraryImage = Image.createImage("red.png");
           importantForm.setBgImage(bgImage);
            
            Button airportButton = new Button("አየር መንገድ", airportImage);
            Button transportButton = new Button("መጓጓዣ", transportImage);
            Button libraryButton = new Button("ቤተ መፅሀፍት", libraryImage);
            importantForm.setLayout(new GridLayout(1, 3));
            
            airportButton.setTextPosition(Component.BOTTOM);
            transportButton.setTextPosition(Component.BOTTOM);
            libraryButton.setTextPosition(Component.BOTTOM);
            
            airportButton.getStyle().setBgTransparency(0, true);
            transportButton.getStyle().setBgTransparency(0, true);
            libraryButton.getStyle().setBgTransparency(0, true);

            airportButton.getSelectedStyle().setBgTransparency(170);
            airportButton.getSelectedStyle().setBorder(null);
            transportButton.getSelectedStyle().setBgTransparency(170);
            transportButton.getSelectedStyle().setBorder(null);
            libraryButton.getSelectedStyle().setBgTransparency(170);
            libraryButton.getSelectedStyle().setBorder(null);

            airportButton.getStyle().setFgColor(0xffffff);
            transportButton.getStyle().setFgColor(0xffffff);
            libraryButton.getStyle().setFgColor(0xffffff);

            airportButton.getUnselectedStyle().setBorder(null, true);
            transportButton.getUnselectedStyle().setBorder(null, true);
            libraryButton.getUnselectedStyle().setBorder(null, true);

            airportButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
            transportButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
            libraryButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);

            airportButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(7);} catch (Exception ex) {}}});
			transportButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(0);} catch (Exception ex) {}}});
			libraryButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(10);} catch (Exception ex) {}}});

            importantForm.addComponent(airportButton);    
            importantForm.addComponent(transportButton);
            importantForm.addComponent(libraryButton);  
            importantForm.setLayout(new GridLayout(3,3));
            importantForm.addCommand(backCommand);
            importantForm.show();
        } catch (Exception e) {System.out.println("henok "+e);}
    }

    public void financeForm(){
        Form financeForm = new Form();
        Command backCommand = new Command("ተመለስ"){public void actionPerformed(ActionEvent ae){startApp();}};
        try {
           Image bgImage = Image.createImage("background.png");
           Image bankImage = Image.createImage("green.png");
           Image insuranceImage = Image.createImage("red.png");
           financeForm.setBgImage(bgImage);
            
            Button bankButton = new Button("ባንክ", bankImage);
            Button insuranceButton = new Button("ኢንሹራንስ", insuranceImage);
            financeForm.setLayout(new GridLayout(1, 3));
            
            bankButton.setTextPosition(Component.BOTTOM);
            insuranceButton.setTextPosition(Component.BOTTOM);
            
            bankButton.getStyle().setBgTransparency(0, true);
            insuranceButton.getStyle().setBgTransparency(0, true);

            bankButton.getSelectedStyle().setBgTransparency(170);
            bankButton.getSelectedStyle().setBorder(null);
            insuranceButton.getSelectedStyle().setBgTransparency(170);
            insuranceButton.getSelectedStyle().setBorder(null);

            bankButton.getStyle().setFgColor(0xffffff);
            insuranceButton.getStyle().setFgColor(0xffffff);

            bankButton.getUnselectedStyle().setBorder(null, true);
            insuranceButton.getUnselectedStyle().setBorder(null, true);

            bankButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
            insuranceButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);

            bankButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(6);} catch (Exception ex) {}}});
            insuranceButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
            showPhoneList(8);} catch (Exception ex) {}}});

            financeForm.addComponent(bankButton);    
            financeForm.addComponent(insuranceButton);  
            financeForm.setLayout(new GridLayout(3,3));
            financeForm.addCommand(backCommand);
            financeForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, true, 1500));
            financeForm.show();
        } catch (Exception e) {System.out.println("henok "+e);}
    }
    
    public void startApp() {
        Display.init(this);
        try{
        Command exitCommand = new Command("\u12CD\u1323"){public void actionPerformed(ActionEvent ae){notifyDestroyed();}};
       
       Image amountButtonIcon = Image.createImage("green.png");
       Image rechargeButtonIcon = Image.createImage("green.png");
       Image transferButtonIcon = Image.createImage("green.png");
       Image callMeBackButtonIcon = Image.createImage("yellow.png");
       Image funButtonIcon = Image.createImage("yellow.png");
       Image emergencyButtonIcon = Image.createImage("yellow.png");
       Image importantButtonIcon = Image.createImage("red.png");
       Image financeButtonIcon = Image.createImage("red.png");
       Image aboutButtonIcon = Image.createImage("red.png");
       Image backgroundImage = Image.createImage("background.png");

        Form lwuit = new Form("\u1348\u1323\u1295");
        lwuit.setLayout(new GridLayout(3,3));

        Button amountButton = new Button("\u1240\u122A \u1202\u1233\u1265",amountButtonIcon);
        Button rechargeButton = new Button("\u1202\u1233\u1265 \u1218\u1219\u12EB",rechargeButtonIcon);
        Button transferButton = new Button("\u1202\u1233\u1265 \u121B\u1235\u1270\u120B\u1208\u134A\u12EB",transferButtonIcon);
        Button callMeBackButton = new Button("\u1218\u120D\u1230\u12CD \u12ED\u12F0\u12CD\u1209\u120D\u129D",callMeBackButtonIcon);
        Button funButton = new Button("\u1218\u12DD\u1293\u129B",funButtonIcon);
        Button emergencyButton = new Button("\u1208\u12A0\u12F0\u130B \u130A\u12DC",emergencyButtonIcon);
        Button importantButton = new Button("\u1320\u1243\u121A \u1218\u1228\u1303\u12CE\u127D",importantButtonIcon);
        Button financeButton = new Button("ፋይናንሽያል መረጃዎች",financeButtonIcon);
        Button aboutButton = new Button("\u1235\u1208 \u12A5\u1294",aboutButtonIcon);

        amountButton.setTextPosition(Component.BOTTOM);
        rechargeButton.setTextPosition(Component.BOTTOM);
        transferButton.setTextPosition(Component.BOTTOM);
        callMeBackButton.setTextPosition(Component.BOTTOM);
        funButton.setTextPosition(Component.BOTTOM);
        emergencyButton.setTextPosition(Component.BOTTOM);
        importantButton.setTextPosition(Component.BOTTOM);
        financeButton.setTextPosition(Component.BOTTOM);
        aboutButton.setTextPosition(Component.BOTTOM);

        amountButton.getStyle().setBgTransparency(0, true);
        rechargeButton.getStyle().setBgTransparency(0, true);
        transferButton.getStyle().setBgTransparency(0, true);
        callMeBackButton.getStyle().setBgTransparency(0, true);
        funButton.getStyle().setBgTransparency(0, true);
        emergencyButton.getStyle().setBgTransparency(0, true);
        importantButton.getStyle().setBgTransparency(0, true);
        financeButton.getStyle().setBgTransparency(0, true);
        aboutButton.getStyle().setBgTransparency(0, true);
        
        amountButton.getStyle().setFgColor(0xffffff);
        rechargeButton.getStyle().setFgColor(0xffffff);
        transferButton.getStyle().setFgColor(0xffffff);
        callMeBackButton.getStyle().setFgColor(0xffffff);
        funButton.getStyle().setFgColor(0xffffff);
        emergencyButton.getStyle().setFgColor(0xffffff);
        importantButton.getStyle().setFgColor(0xffffff);
        financeButton.getStyle().setFgColor(0xffffff);
        aboutButton.getStyle().setFgColor(0xffffff);
        
        amountButton.getUnselectedStyle().setBorder(null, true);
        rechargeButton.getUnselectedStyle().setBorder(null, true);
        transferButton.getUnselectedStyle().setBorder(null, true);
        callMeBackButton.getUnselectedStyle().setBorder(null, true);
        funButton.getUnselectedStyle().setBorder(null, true);
        emergencyButton.getUnselectedStyle().setBorder(null, true);
        importantButton.getUnselectedStyle().setBorder(null, true);
        financeButton.getUnselectedStyle().setBorder(null, true);
        aboutButton.getUnselectedStyle().setBorder(null, true);

        amountButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
        rechargeButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
        transferButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
        callMeBackButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
        funButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
        emergencyButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
        importantButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
        financeButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);
        aboutButton.getSelectedStyle().setFont(Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_MEDIUM), true);

        amountButton.getSelectedStyle().setBgTransparency(170);
        amountButton.getSelectedStyle().setBorder(null);
        rechargeButton.getSelectedStyle().setBgTransparency(170);
        rechargeButton.getSelectedStyle().setBorder(null);
        transferButton.getSelectedStyle().setBgTransparency(170);
        transferButton.getSelectedStyle().setBorder(null);
        callMeBackButton.getSelectedStyle().setBgTransparency(170);
        callMeBackButton.getSelectedStyle().setBorder(null);
        funButton.getSelectedStyle().setBgTransparency(170);
        funButton.getSelectedStyle().setBorder(null);
        emergencyButton.getSelectedStyle().setBgTransparency(170);
        emergencyButton.getSelectedStyle().setBorder(null);
        importantButton.getSelectedStyle().setBgTransparency(170);
        importantButton.getSelectedStyle().setBorder(null);
        financeButton.getSelectedStyle().setBgTransparency(170);
        financeButton.getSelectedStyle().setBorder(null);
        aboutButton.getSelectedStyle().setBgTransparency(170);
        aboutButton.getSelectedStyle().setBorder(null);
        
        amountButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        callTo(FetanOperations.amountPrefix+FetanOperations.suffix);} catch (Exception ex) {}}});
        rechargeButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        rechargeForm();} catch (Exception ex) {}}});
        transferButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        transferForm();} catch (Exception ex) {}}});
        callMeBackButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        callMeBackForm();} catch (Exception ex) {}}});
        funButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        funForm();} catch (Exception ex) {}}});
        importantButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        importantForm();} catch (Exception ex) {}}});
        emergencyButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        emergencyForm();} catch (Exception ex) {}}});
        financeButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        financeForm();} catch (Exception ex) {}}});
        aboutButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent ae){try {
        aboutMe();} catch (Exception ex) {}}});

        lwuit.addCommand(exitCommand);
        lwuit.addComponent(amountButton);
        lwuit.addComponent(rechargeButton);
        lwuit.addComponent(transferButton);
        lwuit.addComponent(callMeBackButton);
        lwuit.addComponent(funButton);
        lwuit.addComponent(emergencyButton);
        lwuit.addComponent(importantButton);
        lwuit.addComponent(financeButton);
        lwuit.addComponent(aboutButton);
        lwuit.setBgImage(backgroundImage);
        lwuit.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, false, 1500));
        lwuit.show();
        }
        catch(Exception e){
            System.out.println("Henok"+e);
        }
    }
    public void pauseApp() {}
    public void destroyApp(boolean unconditional) {}
}