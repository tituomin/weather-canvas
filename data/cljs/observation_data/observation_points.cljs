(ns observation-data.observation-points)


(def metadata
  [{  :title "Lammi Evo"
      :id 101155
      :lat [61.18349 61.18359]
      :lon [25.08002 25.08012]
      :start 1959
      :end 1964 } 
{     :title "Reisjärvi"
      :id 101676
      :lat [63.66692 63.66702]
      :lon [24.82968 24.82978]
      :start 1959
      :end 1964 } 
{     :title "Hanko kpki"
      :id 100933
      :lat [59.81672 59.81682]
      :lon [22.9634 22.9635]
      :start 1959
      :end 1964 } 
{     :title "Vallisaari"
      :id 101010
      :lat [60.13345 60.13355]
      :lon [24.9968 24.9969]
      :start 1959
      :end 1965 } 
{     :title "Jämsänkoski"
      :id 101340
      :lat [61.91686 61.91696]
      :lon [25.1466 25.1467]
      :start 1959
      :end 1965 } 
{     :title "Ristijärvi Hiisijärvi"
      :id 101744
      :lat [64.36705 64.36715]
      :lon [28.5798 28.5799]
      :start 1959
      :end 1968 } 
{     :title "Valkeala Selänpää Verla"
      :id 101213
      :lat [61.06687 61.06697]
      :lon [26.63011 26.63021]
      :start 1966
      :end 1968 } 
{     :title "Laukaa Nurmijärvi Jokihaara"
      :id 101538
      :lat [62.55024 62.55034]
      :lon [25.9799 25.98]
      :start 1965
      :end 1969 } 
{     :title "Helsinki Viikin koetila"
      :id 101011
      :lat [60.21679 60.21689]
      :lon [25.03012 25.03022]
      :start 1959
      :end 1969 } 
{     :title "Rautavaara Tiilikka"
      :id 101752
      :lat [63.53368 63.53378]
      :lon [28.47991 28.48001]
      :start 1965
      :end 1970 } 
{     :title "Teuva kk"
      :id 101261
      :lat [62.46679 62.46689]
      :lon [21.74635 21.74645]
      :start 1965
      :end 1970 } 
{     :title "Mäntyharju Pärnämäki"
      :id 101205
      :lat [61.30021 61.30031]
      :lon [26.58008 26.58018]
      :start 1965
      :end 1970 } 
{     :title "Muonio kk Alaniemi"
      :id 101971
      :lat [67.9671 67.9672]
      :lon [23.69559 23.69569]
      :start 1965
      :end 1970 } 
{     :title "Karkku Heinoo"
      :id 101087
      :lat [61.40011 61.40021]
      :lon [22.97988 22.97998]
      :start 1967
      :end 1970 } 
{     :title "Joutsa Pärnämäki"
      :id 101379
      :lat [61.76689 61.76699]
      :lon [26.36335 26.36345]
      :start 1969
      :end 1970 } 
{     :title "Pyhäjärvi Ol Vuohtomäki"
      :id 101710
      :lat [63.58361 63.58371]
      :lon [26.0631 26.0632]
      :start 1966
      :end 1970 } 
{     :title "Pielisjärvi Koli matkailuhotelli"
      :id 101617
      :lat [63.10036 63.10046]
      :lon [29.79672 29.79682]
      :start 1966
      :end 1970 } 
{     :title "Lohja Immula"
      :id 100984
      :lat [60.25009 60.25019]
      :lon [24.16339 24.16349]
      :start 1970
      :end 1970 } 
{     :title "Suomussalmi Hulkonniemi"
      :id 101816
      :lat [64.91708 64.91718]
      :lon [28.94642 28.94652]
      :start 1970
      :end 1970 } 
{     :title "Tampere kpki"
      :id 101307
      :lat [61.50013 61.50023]
      :lon [23.71325 23.71335]
      :start 1965
      :end 1970 } 
{     :title "Pielisjärvi"
      :id 101635
      :lat [63.30038 63.30048]
      :lon [30.01337 30.01347]
      :start 1959
      :end 1970 } 
{     :title "Kitee Puhossalo"
      :id 101449
      :lat [62.11699 62.11709]
      :lon [29.78016 29.78026]
      :start 1965
      :end 1970 } 
{     :title "Rovaniemen mlk Hirvas"
      :id 101858
      :lat [66.41706 66.41716]
      :lon [25.4293 25.4294]
      :start 1965
      :end 1971 } 
{     :title "Kolari Äkäsjoki"
      :id 101973
      :lat [67.51708 67.51718]
      :lon [23.86235 23.86245]
      :start 1965
      :end 1971 } 
{     :title "Pieksämäki Nikkarila"
      :id 101399
      :lat [62.25026 62.25036]
      :lon [27.24667 27.24677]
      :start 1960
      :end 1971 } 
{     :title "Piikkiö Tuorla"
      :id 100935
      :lat [60.41673 60.41683]
      :lon [22.42997 22.43007]
      :start 1960
      :end 1971 } 
{     :title "Ranua Yliportimo"
      :id 101862
      :lat [66.13373 66.13383]
      :lon [26.16274 26.16284]
      :start 1966
      :end 1971 } 
{     :title "Alahärmä Kuoppala"
      :id 101499
      :lat [63.23351 63.23361]
      :lon [22.64629 22.64639]
      :start 1961
      :end 1971 } 
{     :title "Mäntyharju Paasola"
      :id 101206
      :lat [61.41689 61.41699]
      :lon [26.79675 26.79685]
      :start 1965
      :end 1971 } 
{     :title "Loviisa Valko"
      :id 101031
      :lat [60.40016 60.40026]
      :lon [26.24683 26.24693]
      :start 1965
      :end 1971 } 
{     :title "Viinijärvi"
      :id 101619
      :lat [62.63366 62.63376]
      :lon [29.31342 29.31352]
      :start 1970
      :end 1971 } 
{     :title "Enontekiö Hetta"
      :id 101972
      :lat [68.38378 68.38388]
      :lon [23.62884 23.62894]
      :start 1970
      :end 1971 } 
{     :title "Inari Kiellajoki"
      :id 102030
      :lat [69.30056 69.30066]
      :lon [26.72891 26.72901]
      :start 1971
      :end 1972 } 
{     :title "Rantasalmi Osikonmäki"
      :id 101427
      :lat [62.03361 62.03371]
      :lon [28.28009 28.28019]
      :start 1965
      :end 1972 } 
{     :title "Raahe kpki"
      :id 101779
      :lat [64.68362 64.68372]
      :lon [24.47951 24.47961]
      :start 1965
      :end 1972 } 
{     :title "Gåshällan/Närpiö"
      :id 101463
      :lat [62.56677 62.56687]
      :lon [21.0463 21.0464]
      :start 1967
      :end 1972 } 
{     :title "Hollola Sairakkala"
      :id 101169
      :lat [61.01683 61.01693]
      :lon [25.31339 25.31349]
      :start 1968
      :end 1972 } 
{     :title "Puolanka kk"
      :id 101808
      :lat [64.81705 64.81715]
      :lon [27.69636 27.69646]
      :start 1965
      :end 1972 } 
{     :title "Pyhäntä Tavastkenkä"
      :id 101716
      :lat [64.10031 64.10041]
      :lon [26.09636 26.09646]
      :start 1965
      :end 1972 } 
{     :title "Kittilä Pallasjärvi"
      :id 101978
      :lat [68.01711 68.01721]
      :lon [24.16229 24.16239]
      :start 1959
      :end 1972 } 
{     :title "Naantali keskusta"
      :id 100936
      :lat [60.46672 60.46682]
      :lon [22.02995 22.03005]
      :start 1959
      :end 1972 } 
{     :title "Virrat Killinkoski"
      :id 101304
      :lat [62.40017 62.40027]
      :lon [23.89647 23.89657]
      :start 1965
      :end 1972 } 
{     :title "Kolari Teuravuoma"
      :id 101902
      :lat [67.27933 67.28382]
      :lon [23.76239 23.76776]
      :start 1966
      :end 1972 } 
{     :title "Saarijärvi Häkkilä"
      :id 101546
      :lat [62.75023 62.75033]
      :lon [25.46318 25.46328]
      :start 1968
      :end 1972 } 
{     :title "Piikkiö Yltöinen vertailuas"
      :id 100942
      :lat [60.38339 60.38349]
      :lon [22.54665 22.54675]
      :start 1972
      :end 1972 } 
{     :title "Riihimäki Kara"
      :id 101137
      :lat [60.7668 60.7669]
      :lon [24.78005 24.78015]
      :start 1965
      :end 1973 } 
{     :title "Kittilä Hukkakumpu"
      :id 101977
      :lat [67.71711 67.71721]
      :lon [24.84572 24.84582]
      :start 1970
      :end 1973 } 
{     :title "Joutseno Honkalahti"
      :id 101239
      :lat [61.13358 61.13368]
      :lon [28.4802 28.4803]
      :start 1965
      :end 1973 } 
{     :title "Lieksa kpki"
      :id 101642
      :lat [63.31705 63.31715]
      :lon [30.03003 30.03013]
      :start 1970
      :end 1973 } 
{     :title "Liperi Ahonkylä Kulmala"
      :id 101622
      :lat [62.667 62.6671]
      :lon [29.09673 29.09683]
      :start 1965
      :end 1973 } 
{     :title "Janakkala Kiipula"
      :id 101140
      :lat [60.88347 60.88357]
      :lon [24.7467 24.7468]
      :start 1965
      :end 1973 } 
{     :title "Bromarv Kivitok"
      :id 100956
      :lat [60.00006 60.00016]
      :lon [23.04672 23.04682]
      :start 1961
      :end 1973 } 
{     :title "Ruokolahti Kotaniemi Latosuo"
      :id 101241
      :lat [61.36694 61.36704]
      :lon [28.69686 28.69696]
      :start 1966
      :end 1973 } 
{     :title "Mänttä kpki"
      :id 101318
      :lat [62.03351 62.03361]
      :lon [24.62989 24.62999]
      :start 1970
      :end 1973 } 
{     :title "Salla Tuntsa"
      :id 102010
      :lat [67.56722 67.56732]
      :lon [29.77944 29.77954]
      :start 1970
      :end 1973 } 
{     :title "Enontekiö Kalmankaltio"
      :id 102021
      :lat [68.50048 68.50058]
      :lon [24.7289 24.729]
      :start 1961
      :end 1974 } 
{     :title "Lieksa Hattusaari"
      :id 101618
      :lat [63.15036 63.15046]
      :lon [29.73004 29.73014]
      :start 1965
      :end 1974 } 
{     :title "Lapua Haapakoski"
      :id 101510
      :lat [62.95018 62.95028]
      :lon [23.14636 23.14646]
      :start 1965
      :end 1974 } 
{     :title "Mäntyluoto/Pori"
      :id 101255
      :lat [61.5834 61.5835]
      :lon [21.47979 21.47989]
      :start 1959
      :end 1974 } 
{     :title "Eno kk"
      :id 101638
      :lat [62.78369 62.78379]
      :lon [30.06344 30.06354]
      :start 1963
      :end 1974 } 
{     :title "Hyvinkää lentokenttä"
      :id 101148
      :lat [60.65013 60.65023]
      :lon [24.84673 24.84683]
      :start 1965
      :end 1974 } 
{     :title "Inari Sevettijärvi Varpuniemi"
      :id 102049
      :lat [69.55061 69.55071]
      :lon [28.62901 28.62911]
      :start 1965
      :end 1974 } 
{     :title "Vaala Manamansalo"
      :id 101735
      :lat [64.40035 64.40045]
      :lon [27.16305 27.16315]
      :start 1970
      :end 1974 } 
{     :title "Hyrynsalmi Tapanivaara"
      :id 101765
      :lat [64.46707 64.46717]
      :lon [29.12983 29.12993]
      :start 1965
      :end 1974 } 
{     :title "Nilsiä Vuotjärvi"
      :id 101598
      :lat [63.20033 63.20043]
      :lon [28.27994 28.28004]
      :start 1970
      :end 1974 } 
{     :title "Yläne Vanhakartano"
      :id 101073
      :lat [60.86674 60.86684]
      :lon [22.39659 22.39669]
      :start 1965
      :end 1974 } 
{     :title "Ilomantsi Lehtovaara"
      :id 101640
      :lat [62.80038 62.80048]
      :lon [31.13016 31.13026]
      :start 1968
      :end 1974 } 
{     :title "Säkylä Pyhäjoki"
      :id 101091
      :lat [61.00008 61.00018]
      :lon [22.3799 22.38]
      :start 1971
      :end 1974 } 
{     :title "Pöytyä Kyöstilä"
      :id 101080
      :lat [60.75008 60.75018]
      :lon [22.66329 22.66339]
      :start 1972
      :end 1974 } 
{     :title "Vihti Palojärvi"
      :id 100987
      :lat [60.28344 60.28354]
      :lon [24.38008 24.38018]
      :start 1973
      :end 1974 } 
{     :title "Kajaani kpki"
      :id 101731
      :lat [64.21702 64.21712]
      :lon [27.71311 27.71321]
      :start 1965
      :end 1975 } 
{     :title "Siuntio kk"
      :id 100988
      :lat [60.18343 60.18353]
      :lon [24.19675 24.19685]
      :start 1972
      :end 1975 } 
{     :title "Suonenjoki kpla"
      :id 101574
      :lat [62.60027 62.60037]
      :lon [27.19663 27.19673]
      :start 1965
      :end 1975 } 
{     :title "Liperi Ahonkylä Leppilampi"
      :id 101591
      :lat [62.63365 62.63375]
      :lon [28.98006 28.98016]
      :start 1965
      :end 1975 } 
{     :title "Ylistaro Varrasjärvi"
      :id 101494
      :lat [62.90016 62.90026]
      :lon [22.69634 22.69644]
      :start 1969
      :end 1975 } 
{     :title "Tammela Mustiala"
      :id 101106
      :lat [60.81678 60.81688]
      :lon [23.76333 23.76343]
      :start 1959
      :end 1975 } 
{     :title "Rauma kpki"
      :id 101047
      :lat [61.11672 61.11682]
      :lon [21.46319 21.46329]
      :start 1959
      :end 1975 } 
{     :title "Lammi Kuurikka"
      :id 101171
      :lat [61.11683 61.11693]
      :lon [25.08002 25.08012]
      :start 1969
      :end 1975 } 
{     :title "Suomussalmi Aittokoski"
      :id 101821
      :lat [64.83374 64.83384]
      :lon [28.84643 28.84653]
      :start 1970
      :end 1975 } 
{     :title "Tampere Koivistonkylä"
      :id 101117
      :lat [61.4668 61.4669]
      :lon [23.79659 23.79669]
      :start 1969
      :end 1976 } 
{     :title "Savukoski Tanhua"
      :id 101946
      :lat [67.36717 67.36727]
      :lon [27.71265 27.71275]
      :start 1967
      :end 1976 } 
{     :title "Koski Hl Hyrkkälä"
      :id 101163
      :lat [61.08349 61.08359]
      :lon [25.23004 25.23014]
      :start 1970
      :end 1976 } 
{     :title "Kuortane kk"
      :id 101513
      :lat [62.80018 62.80028]
      :lon [23.4964 23.4965]
      :start 1970
      :end 1976 } 
{     :title "Kuusamo Irni"
      :id 101896
      :lat [65.66712 65.66722]
      :lon [29.16301 29.16311]
      :start 1970
      :end 1976 } 
{     :title "Ulkokalla/Kalajoki"
      :id 101663
      :lat [64.33357 64.33367]
      :lon [23.44617 23.44627]
      :start 1959
      :end 1976 } 
{     :title "Inari Sevettijärvi"
      :id 102050
      :lat [69.55061 69.55071]
      :lon [28.62901 28.62911]
      :start 1971
      :end 1977 } 
{     :title "Tankar/Öja"
      :id 101654
      :lat [63.95021 63.95031]
      :lon [22.8462 22.8463]
      :start 1959
      :end 1977 } 
{     :title "Mustasaari Björköby"
      :id 101476
      :lat [63.35014 63.35024]
      :lon [21.32953 21.32963]
      :start 1965
      :end 1977 } 
{     :title "Hirvensalmi Vahvaselkä"
      :id 101371
      :lat [61.60022 61.60032]
      :lon [26.58005 26.58015]
      :start 1968
      :end 1977 } 
{     :title "Juuka Halivaara"
      :id 101602
      :lat [63.03367 63.03377]
      :lon [28.98001 28.98011]
      :start 1974
      :end 1977 } 
{     :title "Hyrynsalmi kk Jussila"
      :id 101820
      :lat [64.66706 64.66716]
      :lon [28.49643 28.49653]
      :start 1970
      :end 1977 } 
{     :title "Joutsa kk"
      :id 101382
      :lat [61.80021 61.80031]
      :lon [26.06334 26.06344]
      :start 1967
      :end 1977 } 
{     :title "Raahe Saloinen"
      :id 101781
      :lat [64.63362 64.63372]
      :lon [24.47953 24.47963]
      :start 1972
      :end 1977 } 
{     :title "Pielavesi Venetmäki"
      :id 101562
      :lat [63.31697 63.31707]
      :lon [26.96319 26.96329]
      :start 1965
      :end 1977 } 
{     :title "Hartola Sauvuori"
      :id 101369
      :lat [61.56688 61.56698]
      :lon [26.23003 26.23013]
      :start 1967
      :end 1977 } 
{     :title "Hartola Nokankylä"
      :id 101373
      :lat [61.61688 61.61698]
      :lon [26.23003 26.23013]
      :start 1968
      :end 1977 } 
{     :title "Hartola Kirkkola Leppäkoski"
      :id 101344
      :lat [61.63353 61.63363]
      :lon [25.88001 25.88011]
      :start 1968
      :end 1977 } 
{     :title "Hartola Murakka"
      :id 101368
      :lat [61.5502 61.5503]
      :lon [26.0967 26.0968]
      :start 1969
      :end 1977 } 
{     :title "Suonenjoki Iisvesi"
      :id 101576
      :lat [62.66694 62.66704]
      :lon [27.01328 27.01338]
      :start 1970
      :end 1977 } 
{     :title "Ristijärvi Pyhäntä Karhuvaara"
      :id 101750
      :lat [64.41705 64.41715]
      :lon [28.46313 28.46323]
      :start 1970
      :end 1977 } 
{     :title "Pielavesi Säviä"
      :id 101561
      :lat [63.21695 63.21705]
      :lon [26.46317 26.46327]
      :start 1965
      :end 1977 } 
{     :title "Inari Paadar"
      :id 102027
      :lat [68.76719 68.76729]
      :lon [26.22897 26.22907]
      :start 1965
      :end 1977 } 
{     :title "Kuusamo Rukajärvi Rukatupa"
      :id 101893
      :lat [66.16714 66.16724]
      :lon [29.1296 29.1297]
      :start 1967
      :end 1978 } 
{     :title "Lammi Niipala"
      :id 101142
      :lat [61.05015 61.05025]
      :lon [24.98003 24.98013]
      :start 1969
      :end 1978 } 
{     :title "Kuivaniemi Halttula"
      :id 101852
      :lat [65.51702 65.51712]
      :lon [25.26277 25.26287]
      :start 1966
      :end 1978 } 
{     :title "Vihanti Ristonaho"
      :id 101704
      :lat [64.41696 64.41706]
      :lon [25.11293 25.11303]
      :start 1965
      :end 1978 } 
{     :title "Honkajoki Lauhala"
      :id 101280
      :lat [62.08344 62.08354]
      :lon [22.24643 22.24653]
      :start 1965
      :end 1978 } 
{     :title "Anjalankoski Sippola Haukkasuo"
      :id 101201
      :lat [60.8502 60.8503]
      :lon [26.93015 26.93025]
      :start 1965
      :end 1978 } 
{     :title "Enontekiö Kilpisjärvi"
      :id 102014
      :lat [69.0504 69.0505]
      :lon [20.79516 20.79526]
      :start 1959
      :end 1978 } 
{     :title "Alahärmä Yli-Eko"
      :id 101498
      :lat [63.20017 63.20027]
      :lon [22.6963 22.6964]
      :start 1961
      :end 1978 } 
{     :title "Kärsämäki kk"
      :id 101701
      :lat [63.96696 63.96706]
      :lon [25.72969 25.72979]
      :start 1965
      :end 1978 } 
{     :title "Mikkelin mlk Liukkola Ketola"
      :id 101401
      :lat [61.65023 61.65033]
      :lon [27.06341 27.06351]
      :start 1968
      :end 1978 } 
{     :title "Taivalkoski Mustavaara"
      :id 101884
      :lat [65.80043 65.80053]
      :lon [28.04624 28.04634]
      :start 1977
      :end 1978 } 
{     :title "Espoo Otaniemi"
      :id 100972
      :lat [60.18344 60.18354]
      :lon [24.83011 24.83021]
      :start 1968
      :end 1979 } 
{     :title "Mikkeli Liukkola"
      :id 101409
      :lat [61.65023 61.65033]
      :lon [27.08007 27.08017]
      :start 1970
      :end 1979 } 
{     :title "Loviisa keskusta"
      :id 101032
      :lat [60.46683 60.46693]
      :lon [26.21349 26.21359]
      :start 1965
      :end 1979 } 
{     :title "Inari Kiilopää"
      :id 102004
      :lat [68.35054 68.35064]
      :lon [27.4458 27.4459]
      :start 1970
      :end 1979 } 
{     :title "Outokumpu keskusta"
      :id 101588
      :lat [62.717 62.7171]
      :lon [28.98005 28.98015]
      :start 1959
      :end 1979 } 
{     :title "Vaasa Hietalahti"
      :id 101465
      :lat [63.08347 63.08357]
      :lon [21.64626 21.64636]
      :start 1959
      :end 1979 } 
{     :title "Joroinen Kotkatlahti"
      :id 101406
      :lat [62.18361 62.18371]
      :lon [27.91339 27.91349]
      :start 1965
      :end 1979 } 
{     :title "Ylistaro Pelma"
      :id 101496
      :lat [62.93349 62.93359]
      :lon [22.49633 22.49643]
      :start 1967
      :end 1979 } 
{     :title "Vantaa Tikkurila"
      :id 101012
      :lat [60.28345 60.28355]
      :lon [25.06346 25.06356]
      :start 1959
      :end 1979 } 
{     :title "Kärkölä Hähkäniemi"
      :id 101157
      :lat [60.85015 60.85025]
      :lon [25.2634 25.2635]
      :start 1966
      :end 1979 } 
{     :title "Kouvola keskusta"
      :id 101202
      :lat [60.86686 60.86696]
      :lon [26.73014 26.73024]
      :start 1968
      :end 1979 } 
{     :title "Aura Lietsuo"
      :id 101096
      :lat [60.61674 60.61684]
      :lon [22.62996 22.63006]
      :start 1978
      :end 1979 } 
{     :title "Kiihtelysvaara Röksä"
      :id 101637
      :lat [62.60035 62.60045]
      :lon [30.23013 30.23023]
      :start 1965
      :end 1979 } 
{     :title "Sipoo Talma"
      :id 101020
      :lat [60.40013 60.40023]
      :lon [25.18011 25.18021]
      :start 1970
      :end 1979 } 
{     :title "Kittilä Pokka"
      :id 101991
      :lat [68.15049 68.15059]
      :lon [25.79572 25.79582]
      :start 1970
      :end 1979 } 
{     :title "Enontekiö Karesuvanto"
      :id 101967
      :lat [68.45042 68.45052]
      :lon [22.51208 22.51218]
      :start 1968
      :end 1980 } 
{     :title "Kuhmo kk"
      :id 101764
      :lat [64.13373 64.13383]
      :lon [29.51323 29.51333]
      :start 1965
      :end 1980 } 
{     :title "Inari Pikku-Säytsjärvi"
      :id 102039
      :lat [69.40058 69.40068]
      :lon [27.26222 27.26232]
      :start 1969
      :end 1980 } 
{     :title "Oulainen keskusta"
      :id 101684
      :lat [64.26695 64.26705]
      :lon [24.86293 24.86303]
      :start 1965
      :end 1980 } 
{     :title "Sodankylä Madetkoski"
      :id 101997
      :lat [67.80049 67.80059]
      :lon [26.77918 26.77928]
      :start 1969
      :end 1980 } 
{     :title "Ikaalinen keskusta"
      :id 101297
      :lat [61.7668 61.7669]
      :lon [23.06318 23.06328]
      :start 1966
      :end 1980 } 
{     :title "Alavus Rantatöysä"
      :id 101508
      :lat [62.61684 62.61694]
      :lon [23.59643 23.59653]
      :start 1965
      :end 1980 } 
{     :title "Kiihtelysvaara Ruskeakoski"
      :id 101461
      :lat [62.43368 62.43378]
      :lon [30.44683 30.44693]
      :start 1970
      :end 1980 } 
{     :title "Laukaa Kuusa"
      :id 101359
      :lat [62.48356 62.48366]
      :lon [25.91324 25.91334]
      :start 1970
      :end 1980 } 
{     :title "Sodankylä Lisma-Aapa kansakoulu"
      :id 101937
      :lat [67.25046 67.25056]
      :lon [26.54592 26.54602]
      :start 1965
      :end 1980 } 
{     :title "Oulu Pateniemi"
      :id 101791
      :lat [65.08366 65.08376]
      :lon [25.3795 25.3796]
      :start 1965
      :end 1980 } 
{     :title "Vihti Siippoo Liiri"
      :id 100989
      :lat [60.41678 60.41688]
      :lon [24.43007 24.43017]
      :start 1972
      :end 1980 } 
{     :title "Alastaro Virttaa"
      :id 101094
      :lat [60.95008 60.95018]
      :lon [22.64659 22.64669]
      :start 1975
      :end 1980 } 
{     :title "Säkylä Huovinrinne"
      :id 101095
      :lat [61.03341 61.03351]
      :lon [22.46324 22.46334]
      :start 1975
      :end 1980 } 
{     :title "Helsinki Ilmala"
      :id 100973
      :lat [60.20012 60.20022]
      :lon [24.91346 24.91356]
      :start 1959
      :end 1981 } 
{     :title "Alahärmä Vuoskoski"
      :id 101500
      :lat [63.26685 63.26695]
      :lon [22.71296 22.71306]
      :start 1961
      :end 1981 } 
{     :title "Jyväskylä keskusta"
      :id 101341
      :lat [62.23355 62.23365]
      :lon [25.72992 25.73002]
      :start 1959
      :end 1981 } 
{     :title "Kemijärvi Jumisko"
      :id 101944
      :lat [66.51713 66.51723]
      :lon [27.77945 27.77955]
      :start 1959
      :end 1981 } 
{     :title "Parikkala kk"
      :id 101442
      :lat [61.55029 61.55039]
      :lon [29.49688 29.49698]
      :start 1965
      :end 1981 } 
{     :title "Jyväskylä Kypärämäki"
      :id 101354
      :lat [62.23355 62.23365]
      :lon [25.71326 25.71336]
      :start 1969
      :end 1981 } 
{     :title "Rovaniemen mlk Meltaus"
      :id 101921
      :lat [66.91708 66.91718]
      :lon [25.24588 25.24598]
      :start 1961
      :end 1981 } 
{     :title "Ruotsinpyhtää Tesjoki"
      :id 101035
      :lat [60.4335 60.4336]
      :lon [26.36351 26.36361]
      :start 1971
      :end 1981 } 
{     :title "Viitasaari kk Mäkipirtti"
      :id 101544
      :lat [63.08359 63.08369]
      :lon [25.84649 25.84659]
      :start 1965
      :end 1981 } 
{     :title "Parainen keskusta"
      :id 100939
      :lat [60.30005 60.30015]
      :lon [22.26332 22.29675]
      :start 1965
      :end 1981 } 
{     :title "Oripää kk"
      :id 101072
      :lat [60.85008 60.85018]
      :lon [22.71328 22.71338]
      :start 1965
      :end 1981 } 
{     :title "Pyhäjärvi Ol Pyhäsalmi"
      :id 101709
      :lat [63.65029 63.65039]
      :lon [26.04642 26.04652]
      :start 1970
      :end 1981 } 
{     :title "Inari Repojoki"
      :id 101992
      :lat [68.43383 68.43393]
      :lon [25.94568 25.94578]
      :start 1970
      :end 1982 } 
{     :title "Tuusula Ruotsinkylä Lehtola"
      :id 100985
      :lat [60.3668 60.3669]
      :lon [24.9801 24.9802]
      :start 1970
      :end 1982 } 
{     :title "Keuruu Pihlajavesi Lapin koulu"
      :id 101331
      :lat [62.31685 62.31695]
      :lon [24.12983 24.12993]
      :start 1966
      :end 1982 } 
{     :title "Kruunupyy kk"
      :id 101666
      :lat [63.71687 63.71697]
      :lon [23.06291 23.06301]
      :start 1965
      :end 1982 } 
{     :title "Perho Salamajärvi"
      :id 101526
      :lat [63.33356 63.33366]
      :lon [24.61305 24.61315]
      :start 1965
      :end 1982 } 
{     :title "Pernaja Sarvilahti"
      :id 101038
      :lat [60.48349 60.48359]
      :lon [26.13015 26.13025]
      :start 1974
      :end 1983 } 
{     :title "Kiukainen Mäkelä"
      :id 101082
      :lat [61.1834 61.1835]
      :lon [22.07987 22.07997]
      :start 1970
      :end 1983 } 
{     :title "Koski Hl Toijala"
      :id 101175
      :lat [61.01682 61.01692]
      :lon [25.13004 25.13014]
      :start 1971
      :end 1983 } 
{     :title "Ruokolahti Syyspohja"
      :id 101243
      :lat [61.40026 61.40036]
      :lon [28.63018 28.63028]
      :start 1968
      :end 1983 } 
{     :title "Eura Kauttua"
      :id 101076
      :lat [61.10007 61.10017]
      :lon [22.16322 22.16332]
      :start 1961
      :end 1983 } 
{     :title "Ristijärvi Koskenkylä"
      :id 101817
      :lat [64.50038 64.50048]
      :lon [28.36311 28.36321]
      :start 1965
      :end 1983 } 
{     :title "Vuolijoki Otanmäki"
      :id 101730
      :lat [64.117 64.1171]
      :lon [27.04641 27.04651]
      :start 1965
      :end 1984 } 
{     :title "Dragsfjärd Skinnarvik"
      :id 100943
      :lat [60.13338 60.13348]
      :lon [22.44668 22.44678]
      :start 1973
      :end 1984 } 
{     :title "Helsinki Katajaluoto"
      :id 100970
      :lat [60.10011 60.10021]
      :lon [24.91347 24.91357]
      :start 1959
      :end 1984 } 
{     :title "Lapua Siirilä"
      :id 101504
      :lat [62.96684 62.96694]
      :lon [23.01302 23.01312]
      :start 1959
      :end 1984 } 
{     :title "Mietoinen Ravea"
      :id 101056
      :lat [60.66672 60.66682]
      :lon [21.82992 21.83002]
      :start 1969
      :end 1984 } 
{     :title "Inari Partakko"
      :id 102038
      :lat [69.18391 69.18401]
      :lon [27.91236 27.91246]
      :start 1970
      :end 1984 } 
{     :title "Kangasniemi Kutemajärvi"
      :id 101387
      :lat [62.10024 62.10034]
      :lon [26.72999 26.73009]
      :start 1965
      :end 1985 } 
{     :title "Vihti Suksela"
      :id 100982
      :lat [60.41678 60.41688]
      :lon [24.43007 24.43017]
      :start 1969
      :end 1985 } 
{     :title "Eno Löytöjärvi"
      :id 101647
      :lat [62.58369 62.58379]
      :lon [30.33014 30.33024]
      :start 1983
      :end 1985 } 
{     :title "Kirkkonummi Pickala"
      :id 100977
      :lat [60.1001 60.1002]
      :lon [24.34677 24.34687]
      :start 1965
      :end 1985 } 
{     :title "Rovaniemen mlk Pisavaara"
      :id 101855
      :lat [66.31705 66.31715]
      :lon [25.16264 25.16274]
      :start 1968
      :end 1985 } 
{     :title "Lahti Kujala"
      :id 101158
      :lat [60.96684 60.96694]
      :lon [25.71341 25.71351]
      :start 1959
      :end 1985 } 
{     :title "Ruovesi Pekkala"
      :id 101325
      :lat [61.91683 61.91693]
      :lon [24.06321 24.06331]
      :start 1965
      :end 1985 } 
{     :title "Valkeakoski Myttäälä"
      :id 101145
      :lat [61.31681 61.31691]
      :lon [24.04662 24.04672]
      :start 1965
      :end 1985 } 
{     :title "Tarvasjoki Eura"
      :id 101069
      :lat [60.56674 60.56684]
      :lon [22.76331 22.76341]
      :start 1965
      :end 1986 } 
{     :title "Pyhäntä Ahokylä"
      :id 101715
      :lat [64.05032 64.05042]
      :lon [26.52972 26.52982]
      :start 1967
      :end 1986 } 
{     :title "Ranua Ylimaa"
      :id 101863
      :lat [66.18373 66.18383]
      :lon [26.22939 26.22949]
      :start 1968
      :end 1986 } 
{     :title "Sonkajärvi Rutakko"
      :id 101728
      :lat [63.65033 63.65043]
      :lon [27.52984 27.52994]
      :start 1965
      :end 1986 } 
{     :title "Sievi asema"
      :id 101681
      :lat [63.95025 63.98368]
      :lon [24.2796 24.34638]
      :start 1965
      :end 1986 } 
{     :title "Haapajärvi maamieskoulu"
      :id 101694
      :lat [63.75027 63.75037]
      :lon [25.3297 25.3298]
      :start 1959
      :end 1986 } 
{     :title "Vihti Kotkaniemi"
      :id 100980
      :lat [60.40011 60.40021]
      :lon [24.44674 24.44684]
      :start 1966
      :end 1986 } 
{     :title "Kauhajoki Muurahainen"
      :id 101287
      :lat [62.15012 62.15022]
      :lon [22.22975 22.22985]
      :start 1970
      :end 1986 } 
{     :title "Enonkoski Karvila"
      :id 101433
      :lat [62.06697 62.06707]
      :lon [28.84679 28.84689]
      :start 1986
      :end 1987 } 
{     :title "Kangasala Köyrä"
      :id 101316
      :lat [61.55015 61.55025]
      :lon [24.22993 24.23003]
      :start 1966
      :end 1987 } 
{     :title "Outokumpu Sukkulansalo"
      :id 101615
      :lat [62.817 62.8171]
      :lon [29.08004 29.08014]
      :start 1967
      :end 1987 } 
{     :title "Helsinki Marjaniemi"
      :id 101021
      :lat [60.20012 60.20022]
      :lon [25.08013 25.08023]
      :start 1970
      :end 1987 } 
{     :title "Puolanka kk"
      :id 101814
      :lat [64.86705 64.86715]
      :lon [27.69635 27.69645]
      :start 1971
      :end 1987 } 
{     :title "Inari Kaamanen"
      :id 102041
      :lat [69.11723 69.11733]
      :lon [27.17898 27.17908]
      :start 1970
      :end 1988 } 
{     :title "Ikaalinen Varpee"
      :id 101276
      :lat [61.71679 61.71689]
      :lon [22.7965 22.7966]
      :start 1967
      :end 1988 } 
{     :title "Kitee kk"
      :id 101458
      :lat [62.10033 62.10043]
      :lon [30.13019 30.13029]
      :start 1964
      :end 1988 } 
{     :title "Alajärvi keskusta"
      :id 101511
      :lat [62.98352 62.98362]
      :lon [23.77972 23.77982]
      :start 1967
      :end 1988 } 
{     :title "Kuusamo Rukajärvi Rukan huippu"
      :id 101895
      :lat [66.16714 66.16724]
      :lon [29.14627 29.14637]
      :start 1986
      :end 1988 } 
{     :title "Jyväskylän mlk Tikkakoski"
      :id 101360
      :lat [62.40022 62.40032]
      :lon [25.59656 25.59666]
      :start 1978
      :end 1988 } 
{     :title "Lammi Evo"
      :id 101180
      :lat [61.20016 61.20026]
      :lon [25.13002 25.13012]
      :start 1986
      :end 1988 } 
{     :title "Kuhmo Jonkeri"
      :id 101766
      :lat [63.76706 63.76716]
      :lon [29.84663 29.84673]
      :start 1970
      :end 1988 } 
{     :title "Rauma majakka"
      :id 101058
      :lat [61.15005 61.15015]
      :lon [21.16317 21.16327]
      :start 1984
      :end 1988 } 
{     :title "Pudasjärvi Sotkajärvi"
      :id 101811
      :lat [65.31706 65.31716]
      :lon [27.34626 27.34636]
      :start 1966
      :end 1988 } 
{     :title "Pello Sirkkakoski"
      :id 101912
      :lat [66.65038 66.65048]
      :lon [24.4292 24.4293]
      :start 1970
      :end 1988 } 
{     :title "Lammi Urjankangas"
      :id 101177
      :lat [61.10016 61.10026]
      :lon [25.13003 25.13013]
      :start 1971
      :end 1988 } 
{     :title "Pedersöre Lappfors"
      :id 101664
      :lat [63.51687 63.51697]
      :lon [23.19628 23.19638]
      :start 1965
      :end 1988 } 
{     :title "Suomusjärvi Kettula"
      :id 100952
      :lat [60.40009 60.40019]
      :lon [23.76338 23.76348]
      :start 1959
      :end 1989 } 
{     :title "Hyrynsalmi Hoikka"
      :id 101819
      :lat [64.71707 64.71717]
      :lon [28.6631 28.6632]
      :start 1965
      :end 1989 } 
{     :title "Loimaa Vesikoski"
      :id 101111
      :lat [60.85009 60.85019]
      :lon [23.02995 23.03005]
      :start 1965
      :end 1989 } 
{     :title "Espoo Nuuksio"
      :id 100991
      :lat [60.31678 60.31688]
      :lon [24.54673 24.54683]
      :start 1981
      :end 1989 } 
{     :title "Vaala Jaalanka"
      :id 101807
      :lat [64.56702 64.56712]
      :lon [27.16303 27.16313]
      :start 1967
      :end 1989 } 
{     :title "Hyrynsalmi Hannula"
      :id 101825
      :lat [64.68372 64.68382]
      :lon [28.5131 28.5132]
      :start 1978
      :end 1989 } 
{     :title "Pattijoki Ylipää Nikkari"
      :id 101777
      :lat [64.63362 64.65039]
      :lon [24.67953 24.72963]
      :start 1968
      :end 1989 } 
{     :title "Ilomantsi Välivaara"
      :id 101645
      :lat [62.86706 62.86716]
      :lon [31.24683 31.24693]
      :start 1977
      :end 1989 } 
{     :title "Iitti Koskenniska"
      :id 101204
      :lat [61.08352 61.08362]
      :lon [26.18008 26.18018]
      :start 1965
      :end 1989 } 
{     :title "Kivijärvi Peltokangas"
      :id 101549
      :lat [63.11691 63.11701]
      :lon [25.07977 25.07987]
      :start 1969
      :end 1990 } 
{     :title "Kristiinankaupunki keskusta"
      :id 101260
      :lat [62.26677 62.26687]
      :lon [21.39636 21.39646]
      :start 1964
      :end 1990 } 
{     :title "Pattijoki Ylipää Sorttanen"
      :id 101780
      :lat [64.66696 64.66706]
      :lon [24.66286 24.66296]
      :start 1965
      :end 1990 } 
{     :title "Korpilahti Ylä-Muuratjärvi Parkkola"
      :id 101353
      :lat [62.15021 62.15031]
      :lon [25.36325 25.36335]
      :start 1967
      :end 1990 } 
{     :title "Paltamo Keräsenvaara"
      :id 101739
      :lat [64.40036 64.40046]
      :lon [27.57974 27.57984]
      :start 1987
      :end 1990 } 
{     :title "Toivakka kk"
      :id 101386
      :lat [62.10022 62.10032]
      :lon [26.0633 26.0634]
      :start 1966
      :end 1990 } 
{     :title "Pieksämäki"
      :id 101411
      :lat [62.30026 62.30036]
      :lon [27.14666 27.14676]
      :start 1970
      :end 1990 } 
{     :title "Anjalankoski"
      :id 101209
      :lat [60.70019 60.70029]
      :lon [26.83016 26.83026]
      :start 1970
      :end 1990 } 
{     :title "Nakkila Kivialho"
      :id 101083
      :lat [61.38341 61.38351]
      :lon [22.06318 22.06328]
      :start 1970
      :end 1990 } 
{     :title "Kiikoinen Jaara"
      :id 101084
      :lat [61.41677 61.41687]
      :lon [22.57986 22.57996]
      :start 1970
      :end 1990 } 
{     :title "Orimattila Keituri"
      :id 101167
      :lat [60.83348 60.83358]
      :lon [25.43007 25.43017]
      :start 1970
      :end 1990 } 
{     :title "Kullaa Saarijärvi"
      :id 101288
      :lat [61.53342 61.53352]
      :lon [22.2965 22.2966]
      :start 1970
      :end 1990 } 
{     :title "Kuhmoinen Puukkoinen Kiviniemi"
      :id 101357
      :lat [61.66685 61.66695]
      :lon [25.1633 25.1634]
      :start 1970
      :end 1990 } 
{     :title "Konnevesi Mertajärvi Särkisalo"
      :id 101563
      :lat [62.75025 62.75035]
      :lon [26.16322 26.16332]
      :start 1970
      :end 1990 } 
{     :title "Juuka Järvikylä"
      :id 101620
      :lat [63.10035 63.10045]
      :lon [29.46337 29.46347]
      :start 1970
      :end 1990 } 
{     :title "Merijärvi Pirttimäki"
      :id 101686
      :lat [64.41694 64.41704]
      :lon [24.32954 24.32964]
      :start 1970
      :end 1990 } 
{     :title "Kiuruvesi Hautajoki Lappala"
      :id 101719
      :lat [63.61697 63.61707]
      :lon [26.67979 26.67989]
      :start 1970
      :end 1990 } 
{     :title "Vuolijoki Myllylä"
      :id 101734
      :lat [64.20033 64.20043]
      :lon [27.01307 27.01317]
      :start 1970
      :end 1990 } 
{     :title "Inari Solojärvi"
      :id 102029
      :lat [68.87 68.87]
      :lon [26.83 26.83]
      :start 1970
      :end 1990 } 
{     :title "Kiikala Kruusila"
      :id 100962
      :lat [60.36675 60.36685]
      :lon [23.43003 23.43013]
      :start 1970
      :end 1990 } 
{     :title "Rovaniemi Pekkala"
      :id 101868
      :lat [66.35043 66.35053]
      :lon [26.82941 26.82951]
      :start 1970
      :end 1990 } 
{     :title "Karjaa Knapsby Mustio"
      :id 100960
      :lat [60.15009 60.15019]
      :lon [23.83007 23.83017]
      :start 1970
      :end 1990 } 
{     :title "Huittinen Lauha"
      :id 101089
      :lat [61.20009 61.20019]
      :lon [22.56323 22.56333]
      :start 1970
      :end 1990 } 
{     :title "Pihtipudas Tapiola"
      :id 101548
      :lat [63.36693 63.36703]
      :lon [25.5631 25.5632]
      :start 1970
      :end 1990 } 
{     :title "Kiuruvesi Lapinsalo"
      :id 101720
      :lat [63.93366 63.93376]
      :lon [26.6131 26.6132]
      :start 1970
      :end 1990 } 
{     :title "Valtimo Elomäki"
      :id 101749
      :lat [63.78369 63.78379]
      :lon [28.64656 28.64666]
      :start 1970
      :end 1990 } 
{     :title "Sipoo Martinkylä"
      :id 101019
      :lat [60.40013 60.40023]
      :lon [25.23011 25.23021]
      :start 1970
      :end 1990 } 
{     :title "Hanko Santala"
      :id 100959
      :lat [59.88339 59.88349]
      :lon [23.1134 23.1135]
      :start 1970
      :end 1990 } 
{     :title "Rovaniemi Jääskö"
      :id 101923
      :lat [67.03375 67.03385]
      :lon [25.09585 25.09595]
      :start 1970
      :end 1990 } 
{     :title "Nurmes Lipinlahti"
      :id 101621
      :lat [63.4837 63.4838]
      :lon [29.32997 29.33007]
      :start 1970
      :end 1990 } 
{     :title "Anttola kk"
      :id 101412
      :lat [61.58357 61.58367]
      :lon [27.64677 27.64687]
      :start 1970
      :end 1990 } 
{     :title "Ranua"
      :id 101867
      :lat [65.93373 65.93383]
      :lon [26.56279 26.56289]
      :start 1970
      :end 1990 } 
{     :title "Suomussalmi Ruhtinansalmi"
      :id 101836
      :lat [65.21711 65.21721]
      :lon [29.51309 29.51319]
      :start 1970
      :end 1990 } 
{     :title "Lammi Evo"
      :id 101176
      :lat [61.18349 61.18359]
      :lon [25.2467 25.2468]
      :start 1971
      :end 1990 } 
{     :title "Eura Haveri"
      :id 101092
      :lat [60.9834 60.9835]
      :lon [22.21324 22.21334]
      :start 1974
      :end 1990 } 
{     :title "Juva Hatsola"
      :id 101405
      :lat [61.86693 61.86703]
      :lon [27.76342 27.76352]
      :start 1965
      :end 1990 } 
{     :title "Turku Ruissalo"
      :id 100941
      :lat [60.43338 60.43348]
      :lon [22.17996 22.18006]
      :start 1971
      :end 1990 } 
{     :title "Kuusankoski keskusta"
      :id 101195
      :lat [60.90019 60.90029]
      :lon [26.6468 26.6469]
      :start 1959
      :end 1990 } 
{     :title "Hauho Hahkiala"
      :id 101133
      :lat [61.15 61.15]
      :lon [24.58 24.58]
      :start 1964
      :end 1990 } 
{     :title "Kannus Ylikannus"
      :id 101680
      :lat [63.86691 63.86701]
      :lon [24.04628 24.04638]
      :start 1965
      :end 1990 } 
{     :title "Salla Salmivaara Lumimaa"
      :id 101954
      :lat [66.78381 66.78391]
      :lon [28.26278 28.26288]
      :start 1965
      :end 1990 } 
{     :title "Kittilä Kiistala"
      :id 101993
      :lat [67.86713 67.86723]
      :lon [25.32906 25.34583]
      :start 1965
      :end 1990 } 
{     :title "Janakkala Turenki"
      :id 101141
      :lat [60.93347 60.93357]
      :lon [24.68003 24.68013]
      :start 1965
      :end 1990 } 
{     :title "Imatra Siitola"
      :id 101240
      :lat [61.16693 61.16703]
      :lon [28.78022 28.78032]
      :start 1966
      :end 1990 } 
{     :title "Pohja Pinjainen"
      :id 100958
      :lat [60.08341 60.08351]
      :lon [23.66341 23.71351]
      :start 1966
      :end 1990 } 
{     :title "Salla Naruskajärvi"
      :id 101965
      :lat [67.3672 67.3673]
      :lon [29.36278 29.36288]
      :start 1974
      :end 1990 } 
{     :title "Multia Sahrajärvi Linjala"
      :id 101550
      :lat [62.50021 62.50031]
      :lon [25.1632 25.1633]
      :start 1982
      :end 1990 } 
{     :title "Puolanka Rasinkylä"
      :id 101815
      :lat [64.81706 64.81716]
      :lon [27.9297 27.9298]
      :start 1987
      :end 1990 } 
{     :title "Enontekiö Kelottijärvi Munnikurkkio"
      :id 102018
      :lat [68.96711 68.96721]
      :lon [22.12861 22.12871]
      :start 1965
      :end 1991 } 
{     :title "Kalajoki Rahja"
      :id 101672
      :lat [64.21691 64.21701]
      :lon [23.6962 23.6963]
      :start 1978
      :end 1991 } 
{     :title "Rovaniemen mlk Marrasjärvi"
      :id 101925
      :lat [66.88374 66.88384]
      :lon [25.17921 25.17931]
      :start 1983
      :end 1991 } 
{     :title "Pietarsaari Mässkär Västersund"
      :id 101653
      :lat [63.73352 63.73362]
      :lon [22.57954 22.57964]
      :start 1964
      :end 1991 } 
{     :title "Hyrynsalmi kk"
      :id 101823
      :lat [64.7004 64.7005]
      :lon [28.59643 28.59653]
      :start 1964
      :end 1991 } 
{     :title "Rovaniemen mlk Pekkala Telkkälä"
      :id 101869
      :lat [66.30043 66.30053]
      :lon [26.86276 26.86286]
      :start 1968
      :end 1991 } 
{     :title "Pertunmaa Ruorasmäki"
      :id 101370
      :lat [61.60021 61.60031]
      :lon [26.39671 26.39681]
      :start 1969
      :end 1991 } 
{     :title "Tuusula Hyrylä"
      :id 101015
      :lat [60.4168 60.4169]
      :lon [25.0301 25.0302]
      :start 1959
      :end 1991 } 
{     :title "Parikkala Tarvaslampi"
      :id 101451
      :lat [61.68363 61.68373]
      :lon [29.38019 29.39696]
      :start 1983
      :end 1992 } 
{     :title "Rautio kk"
      :id 101688
      :lat [64.0836 64.0837]
      :lon [24.2296 24.2297]
      :start 1986
      :end 1992 } 
{     :title "Puolanka Rasinkylä"
      :id 101827
      :lat [64.81706 64.81716]
      :lon [28.04638 28.04648]
      :start 1991
      :end 1992 } 
{     :title "Savukoski Kemihaara RJV"
      :id 102011
      :lat [67.96722 67.96732]
      :lon [28.99598 28.99608]
      :start 1965
      :end 1992 } 
{     :title "Saarijärvi Leuhunkoski"
      :id 101540
      :lat [62.66689 62.66699]
      :lon [25.26318 25.26328]
      :start 1965
      :end 1992 } 
{     :title "Äetsä Pehula"
      :id 101088
      :lat [61.28343 61.28353]
      :lon [22.69656 22.69666]
      :start 1965
      :end 1992 } 
{     :title "Korsnäs Moikipää"
      :id 101477
      :lat [62.88344 62.88354]
      :lon [21.09626 21.09636]
      :start 1974
      :end 1992 } 
{     :title "Keuruu Suolahti"
      :id 101330
      :lat [62.26686 62.26696]
      :lon [24.7132 24.7133]
      :start 1965
      :end 1993 } 
{     :title "Pattijoki Jokela"
      :id 101778
      :lat [64.66696 64.66706]
      :lon [24.61286 24.61296]
      :start 1965
      :end 1993 } 
{     :title "Kuusamo kk Ronkainen"
      :id 101890
      :lat [65.91713 65.93389]
      :lon [29.17963 29.22974]
      :start 1965
      :end 1993 } 
{     :title "Uusikaarlepyy keskusta"
      :id 101657
      :lat [63.53351 63.53361]
      :lon [22.52957 22.52967]
      :start 1965
      :end 1993 } 
{     :title "Kihniö Kankari"
      :id 101302
      :lat [62.18347 62.18357]
      :lon [23.07979 23.07989]
      :start 1965
      :end 1993 } 
{     :title "Virolahti Ravijärvi"
      :id 101221
      :lat [60.58353 60.58363]
      :lon [27.48021 27.48031]
      :start 1965
      :end 1993 } 
{     :title "Posio Perä-Posio"
      :id 101874
      :lat [66.18377 66.18387]
      :lon [27.87951 27.87961]
      :start 1966
      :end 1993 } 
{     :title "Savitaipale Peltoinlahti"
      :id 101228
      :lat [61.20023 61.20033]
      :lon [27.68015 27.68025]
      :start 1966
      :end 1993 } 
{     :title "Pyhäjärvi Ol Hiidenkylä"
      :id 101696
      :lat [63.56694 63.56704]
      :lon [25.74641 25.74651]
      :start 1966
      :end 1993 } 
{     :title "Nilsiä kk Uitti"
      :id 101597
      :lat [63.21699 63.21709]
      :lon [28.06327 28.06337]
      :start 1968
      :end 1993 } 
{     :title "Lammi Ronni"
      :id 101172
      :lat [61.08349 61.08359]
      :lon [25.13003 25.13013]
      :start 1968
      :end 1993 } 
{     :title "Juva kk Partala"
      :id 101417
      :lat [61.90026 61.90036]
      :lon [27.88008 27.88018]
      :start 1991
      :end 1993 } 
{     :title "Kihniö Aitoneva"
      :id 101294
      :lat [62.20015 62.20025]
      :lon [23.31314 23.31324]
      :start 1959
      :end 1993 } 
{     :title "Espoo Kauklahti"
      :id 100978
      :lat [60.21678 60.21688]
      :lon [24.64677 24.64687]
      :start 1961
      :end 1993 } 
{     :title "Vilppula Pohjaslahti"
      :id 101328
      :lat [62.15017 62.15027]
      :lon [24.04651 24.04661]
      :start 1966
      :end 1993 } 
{     :title "Ruotsinpyhtää Reimars"
      :id 101034
      :lat [60.36683 60.36693]
      :lon [26.39684 26.39694]
      :start 1971
      :end 1993 } 
{     :title "Kolari tulli"
      :id 101906
      :lat [67.30039 67.3505]
      :lon [23.74571 23.82914]
      :start 1984
      :end 1993 } 
{     :title "Närpiö Ylimarkku"
      :id 101467
      :lat [62.61678 62.61688]
      :lon [21.46299 21.46309]
      :start 1968
      :end 1993 } 
{     :title "Tornio Könölä"
      :id 101844
      :lat [65.96702 65.96712]
      :lon [24.46265 24.46275]
      :start 1971
      :end 1993 } 
{     :title "Honkajoki Antila"
      :id 101279
      :lat [61.91678 61.91688]
      :lon [22.22978 22.22988]
      :start 1963
      :end 1993 } 
{     :title "Jämsä Seppola"
      :id 101349
      :lat [61.86686 61.86696]
      :lon [25.17994 25.18004]
      :start 1967
      :end 1993 } 
{     :title "Kolari Kelloniemi"
      :id 101904
      :lat [67.23372 67.23382]
      :lon [23.57904 23.57914]
      :start 1967
      :end 1993 } 
{     :title "Kotka Sunila"
      :id 101192
      :lat [60.50019 60.50029]
      :lon [26.96353 26.96363]
      :start 1959
      :end 1993 } 
{     :title "Pieksämäen mlk Naarajärvi"
      :id 101413
      :lat [62.28359 62.28369]
      :lon [26.97998 26.98008]
      :start 1974
      :end 1993 } 
{     :title "Eurajoki Verkkokari"
      :id 101057
      :lat [61.23339 61.23349]
      :lon [21.62984 21.62994]
      :start 1975
      :end 1993 } 
{     :title "Haukivuori Nykälä"
      :id 101388
      :lat [62.11692 62.11702]
      :lon [26.96334 26.96344]
      :start 1964
      :end 1993 } 
{     :title "Nurmes Porokylä"
      :id 101770
      :lat [63.55036 63.55046]
      :lon [29.07994 29.08004]
      :start 1992
      :end 1993 } 
{     :title "Sotkamo Ylisotkamo"
      :id 101746
      :lat [64.1337 64.1338]
      :lon [28.5465 28.5466]
      :start 1965
      :end 1993 } 
{     :title "Peräseinäjoki Haukineva"
      :id 101502
      :lat [62.55015 62.55025]
      :lon [22.9464 22.9465]
      :start 1975
      :end 1993 } 
{     :title "Enontekiö Kelottijärvi Iitto"
      :id 102015
      :lat [68.75041 68.75051]
      :lon [21.41194 21.41204]
      :start 1976
      :end 1993 } 
{     :title "Pohja Pohjankuru"
      :id 100954
      :lat [60.10008 60.10018]
      :lon [23.53006 23.54683]
      :start 1959
      :end 1993 } 
{     :title "Mouhijärvi Selkee"
      :id 101271
      :lat [61.51678 61.51688]
      :lon [22.97987 22.97997]
      :start 1959
      :end 1993 } 
{     :title "Savonlinna Oravi"
      :id 101431
      :lat [62.10029 62.10039]
      :lon [28.66344 28.66354]
      :start 1986
      :end 1994 } 
{     :title "Kuru Riuttaskylä"
      :id 101300
      :lat [62.06682 62.06692]
      :lon [23.6465 23.6466]
      :start 1965
      :end 1994 } 
{     :title "Kokemäki Kartano"
      :id 101078
      :lat [61.23341 61.23351]
      :lon [22.27987 22.27997]
      :start 1965
      :end 1995 } 
{     :title "Pietarsaari Östanlid"
      :id 101658
      :lat [63.66686 63.66696]
      :lon [22.72956 22.72966]
      :start 1979
      :end 1995 } 
{     :title "Mänttä Raja-Aho"
      :id 101327
      :lat [62.01685 62.01695]
      :lon [24.71324 24.71334]
      :start 1965
      :end 1995 } 
{     :title "Muonio Tapojärvi"
      :id 101970
      :lat [67.53 67.53]
      :lon [23.68 23.68]
      :start 1966
      :end 1995 } 
{     :title "Suomenniemi Punkankylä"
      :id 101230
      :lat [61.35023 61.35033]
      :lon [27.48012 27.48022]
      :start 1965
      :end 1995 } 
{     :title "Joroinen Montolanmäki"
      :id 101414
      :lat [62.1836 62.1837]
      :lon [27.5967 27.5968]
      :start 1979
      :end 1995 } 
{     :title "Ruokolahti Valkjärvi"
      :id 101244
      :lat [61.41694 61.41704]
      :lon [28.64685 28.64695]
      :start 1965
      :end 1995 } 
{     :title "Sonkajärvi kk"
      :id 101729
      :lat [63.70032 63.70042]
      :lon [27.39649 27.39659]
      :start 1965
      :end 1995 } 
{     :title "Ikaalinen Kurkela"
      :id 101274
      :lat [61.70012 61.70022]
      :lon [22.77984 22.77994]
      :start 1966
      :end 1995 } 
{     :title "Inari Toivoniemi"
      :id 102034
      :lat [69.06789 69.06799]
      :lon [27.08515 27.11858]
      :start 1959
      :end 1995 } 
{     :title "Juupajoki Höyde"
      :id 101323
      :lat [61.7835 61.7836]
      :lon [24.54659 24.54669]
      :start 1965
      :end 1995 } 
{     :title "Turku Kaarninko"
      :id 100940
      :lat [60.43338 60.43348]
      :lon [22.27997 22.28007]
      :start 1965
      :end 1995 } 
{     :title "Pietarsaari Leppäluoto"
      :id 101655
      :lat [63.66686 63.66696]
      :lon [22.64623 22.64633]
      :start 1965
      :end 1996 } 
{     :title "Sodankylä Lisma-Aapa Juppura"
      :id 101938
      :lat [67.26713 67.26723]
      :lon [26.52924 26.52934]
      :start 1967
      :end 1996 } 
{     :title "Rovaniemen mlk Pekkala Kivalokangas"
      :id 101865
      :lat [66.33376 66.33386]
      :lon [26.84608 26.84618]
      :start 1968
      :end 1996 } 
{     :title "Isojoki Sarviluoma"
      :id 101286
      :lat [62.11678 62.11688]
      :lon [22.04641 22.04651]
      :start 1969
      :end 1996 } 
{     :title "Savonlinna Juvola"
      :id 101432
      :lat [62.08363 62.08373]
      :lon [28.78012 28.78022]
      :start 1986
      :end 1996 } 
{     :title "Kitee Heinoniemi"
      :id 101453
      :lat [62.20032 62.20042]
      :lon [29.46348 29.46358]
      :start 1991
      :end 1996 } 
{     :title "Kuusamo Nissinvaara"
      :id 101892
      :lat [66.05047 66.05357]
      :lon [29.14628 29.15371]
      :start 1965
      :end 1996 } 
{     :title "Pori Mäntyluoto"
      :id 101264
      :lat [61.60007 61.60017]
      :lon [21.44645 21.44655]
      :start 1984
      :end 1996 } 
{     :title "Oulu Linnanmaa"
      :id 101789
      :lat [65.017 65.03376]
      :lon [25.47952 25.47962]
      :start 1959
      :end 1996 } 
{     :title "Kemijärvi Ryti-Lehtola"
      :id 101945
      :lat [66.56713 66.56723]
      :lon [27.6961 27.6962]
      :start 1969
      :end 1996 } 
{     :title "Haapavesi kk"
      :id 101702
      :lat [64.13362 64.13372]
      :lon [25.37964 25.37974]
      :start 1963
      :end 1996 } 
{     :title "Ilmajoki Peurala"
      :id 101489
      :lat [62.71682 62.73358]
      :lon [22.56303 22.59646]
      :start 1965
      :end 1996 } 
{     :title "Lempäälä Kaakila"
      :id 101115
      :lat [61.35012 61.35022]
      :lon [23.59659 23.59669]
      :start 1969
      :end 1996 } 
{     :title "Kuhmoinen Lästilä"
      :id 101345
      :lat [61.66685 61.66695]
      :lon [25.26331 25.26341]
      :start 1965
      :end 1997 } 
{     :title "Geta Östergeta"
      :id 100922
      :lat [60.38332 60.38342]
      :lon [19.87986 19.87996]
      :start 1992
      :end 1997 } 
{     :title "Huittinen Lauttakylä"
      :id 101067
      :lat [61.16676 61.18352]
      :lon [22.71324 22.78]
      :start 1959
      :end 1997 } 
{     :title "Laukaa Savio"
      :id 101396
      :lat [62.33356 62.33366]
      :lon [25.9966 25.9967]
      :start 1992
      :end 1997 } 
{     :title "Kirkkonummi"
      :id 100998
      :lat [60.23343 60.23353]
      :lon [24.38009 24.38019]
      :start 1992
      :end 1997 } 
{     :title "Lapinjärvi Ingermanninkylä"
      :id 101193
      :lat [60.61684 60.6226]
      :lon [26.13991 26.1469]
      :start 1959
      :end 1997 } 
{     :title "Seinäjoki keskusta"
      :id 101490
      :lat [62.78349 62.78359]
      :lon [22.81303 22.81313]
      :start 1965
      :end 1997 } 
{     :title "Hollola Ala-Okeroinen"
      :id 101181
      :lat [60.90016 60.91693]
      :lon [25.53007 25.58017]
      :start 1991
      :end 1997 } 
{     :title "Somero Hirsjärvi"
      :id 101119
      :lat [60.58343 60.58353]
      :lon [23.69669 23.69679]
      :start 1992
      :end 1997 } 
{     :title "Valkeala Uro"
      :id 101214
      :lat [61.0002 61.0003]
      :lon [26.78012 26.78022]
      :start 1993
      :end 1997 } 
{     :title "Kuhmo Sumsa"
      :id 101768
      :lat [64.26708 64.26718]
      :lon [29.8299 29.83]
      :start 1970
      :end 1997 } 
{     :title "Liperi Kaskesniemi"
      :id 101626
      :lat [62.56701 62.56711]
      :lon [29.64677 29.64687]
      :start 1991
      :end 1997 } 
{     :title "Outokumpu Lukanvaara"
      :id 101592
      :lat [62.65032 62.65042]
      :lon [28.98005 28.98015]
      :start 1967
      :end 1997 } 
{     :title "Kuhmo Paloniemi"
      :id 101767
      :lat [64.10039 64.10049]
      :lon [29.31323 29.31333]
      :start 1970
      :end 1997 } 
{     :title "Parkano Lamminkoski"
      :id 101299
      :lat [62.10014 62.11691]
      :lon [23.01313 23.0299]
      :start 1965
      :end 1997 } 
{     :title "Leppävirta kk"
      :id 101416
      :lat [62.48 62.48]
      :lon [27.78 27.78]
      :start 1991
      :end 1997 } 
{     :title "Kuusamo Maanselkä Ronkainen"
      :id 101888
      :lat [65.90046 65.90056]
      :lon [29.06297 29.06307]
      :start 1969
      :end 1997 } 
{     :title "Sotkamo Tipasoja Saukko"
      :id 101755
      :lat [63.91703 63.91713]
      :lon [28.69656 28.69666]
      :start 1978
      :end 1997 } 
{     :title "Ruokolahti Kotaniemi"
      :id 101238
      :lat [61.36693 61.36703]
      :lon [28.66353 28.66363]
      :start 1964
      :end 1998 } 
{     :title "Kuopio Inkilänmäki"
      :id 101571
      :lat [62.9003 62.9004]
      :lon [27.67995 27.68005]
      :start 1959
      :end 1998 } 
{     :title "Kerimäki Yläkuona"
      :id 101444
      :lat [61.91697 61.9504]
      :lon [29.26349 29.28026]
      :start 1965
      :end 1998 } 
{     :title "Kontiolahti Paihola"
      :id 101623
      :lat [62.70035 62.70045]
      :lon [29.86344 29.86354]
      :start 1973
      :end 1998 } 
{     :title "Sodankylä Lisma-Aapa"
      :id 101934
      :lat [67.25046 67.25056]
      :lon [26.57925 26.57935]
      :start 1970
      :end 1998 } 
{     :title "Alavus Niinimaa"
      :id 101509
      :lat [62.6335 62.6336]
      :lon [23.41309 23.41319]
      :start 1965
      :end 1998 } 
{     :title "Valtimo Koppelo"
      :id 101754
      :lat [63.75036 63.76713]
      :lon [28.56322 28.56333]
      :start 1978
      :end 1998 } 
{     :title "Salla Hautajärvi"
      :id 101963
      :lat [66.51716 66.51726]
      :lon [29.02954 29.02964]
      :start 1965
      :end 1998 } 
{     :title "Virrat Vaskivesi"
      :id 101301
      :lat [62.15016 62.1552]
      :lon [23.64649 23.65445]
      :start 1965
      :end 1998 } 
{     :title "Puumala Vesiniemi"
      :id 101429
      :lat [61.58359 61.58369]
      :lon [28.18014 28.18024]
      :start 1970
      :end 1998 } 
{     :title "Kortesjärvi Saarijärvi"
      :id 101512
      :lat [63.34697 63.35029]
      :lon [23.16297 23.1639]
      :start 1966
      :end 1998 } 
{     :title "Outokumpu Kuokkala"
      :id 101593
      :lat [62.70032 62.70042]
      :lon [28.91338 28.91348]
      :start 1963
      :end 1998 } 
{     :title "Toijala Satama"
      :id 101114
      :lat [61.18346 61.18356]
      :lon [23.92996 23.93006]
      :start 1965
      :end 1998 } 
{     :title "Kuusamo Kurvinen"
      :id 101894
      :lat [65.58379 65.58389]
      :lon [29.51304 29.51314]
      :start 1970
      :end 1998 } 
{     :title "Pyhäjärvi Mäkikylä"
      :id 101718
      :lat [63.51695 63.51705]
      :lon [26.12977 26.12987]
      :start 1970
      :end 1998 } 
{     :title "Kurikka keskusta"
      :id 101488
      :lat [62.61681 62.61693]
      :lon [22.37969 22.39268]
      :start 1965
      :end 1998 } 
{     :title "Kuhmalahti Vehkajärvi"
      :id 101319
      :lat [61.50016 61.50026]
      :lon [24.81331 24.81341]
      :start 1965
      :end 1998 } 
{     :title "Joutsa Jousa"
      :id 101378
      :lat [61.73354 61.73364]
      :lon [26.06334 26.06344]
      :start 1968
      :end 1998 } 
{     :title "Hämeenkoski Käikälä"
      :id 101170
      :lat [61.05016 61.05026]
      :lon [25.16338 25.16348]
      :start 1968
      :end 1998 } 
{     :title "Tuusula Ruotsinkylä"
      :id 101013
      :lat [60.3668 60.3669]
      :lon [24.9801 24.99687]
      :start 1964
      :end 1999 } 
{     :title "Kokkola Öja Märaskär"
      :id 101659
      :lat [63.88354 63.88364]
      :lon [22.92954 22.92964]
      :start 1991
      :end 1999 } 
{     :title "Tampere Härmälä"
      :id 101105
      :lat [61.4668 61.4669]
      :lon [23.72991 23.74668]
      :start 1959
      :end 1999 } 
{     :title "Kittilä Kaukonen"
      :id 101915
      :lat [67.4671 67.4672]
      :lon [24.91244 24.9292]
      :start 1973
      :end 1999 } 
{     :title "Liperi Kaatamo"
      :id 101611
      :lat [62.53365 62.53375]
      :lon [29.21342 29.21352]
      :start 1965
      :end 1999 } 
{     :title "Rovaniemen mlk Törmänki"
      :id 101916
      :lat [66.87759 66.88383]
      :lon [24.96254 24.96564]
      :start 1992
      :end 1999 } 
{     :title "Leppävirta Kotalahti"
      :id 101573
      :lat [62.55028 62.56705]
      :lon [27.51332 27.59676]
      :start 1965
      :end 1999 } 
{     :title "Salla kk"
      :id 101951
      :lat [66.81716 66.82162]
      :lon [28.66281 28.67382]
      :start 1961
      :end 1999 } 
{     :title "Pudasjärvi Kurenalus"
      :id 101806
      :lat [65.36706 65.36716]
      :lon [27.01291 27.01301]
      :start 1959
      :end 1999 } 
{     :title "Hartola Kuivajärvi"
      :id 101207
      :lat [61.46687 61.46697]
      :lon [26.19671 26.19681]
      :start 1967
      :end 1999 } 
{     :title "Inari Nellim"
      :id 102048
      :lat [68.84922 68.84932]
      :lon [28.29909 28.29919]
      :start 1959
      :end 1999 } 
{     :title "Saltvik Kvarnbo"
      :id 100913
      :lat [60.28332 60.28342]
      :lon [20.04655 20.04665]
      :start 1968
      :end 1999 } 
{     :title "Rauma Kuuskajaskari"
      :id 101045
      :lat [61.13922 61.13932]
      :lon [21.36484 21.36494]
      :start 1959
      :end 1999 } 
{     :title "Jyväskylä Keljo"
      :id 101361
      :lat [62.20022 62.20032]
      :lon [25.71327 25.71337]
      :start 1981
      :end 1999 } 
{     :title "Ivalo lentoasema"
      :id 102044
      :lat [68.60053 68.60063]
      :lon [27.42905 27.42915]
      :start 1999
      :end 2000 } 
{     :title "Utsjoki Kevo"
      :id 102045
      :lat [69.75634 69.75644]
      :lon [27.00759 27.00769]
      :start 1999
      :end 2000 } 
{     :title "Heinävesi Hasumäki"
      :id 101428
      :lat [62.40031 62.40041]
      :lon [28.73007 28.73017]
      :start 1963
      :end 2000 } 
{     :title "Ilomantsi kk"
      :id 101634
      :lat [62.66704 62.68381]
      :lon [30.93016 30.94693]
      :start 1959
      :end 2000 } 
{     :title "Lammi Vestola"
      :id 101164
      :lat [61.15016 61.15026]
      :lon [25.21337 25.2468]
      :start 1970
      :end 2000 } 
{     :title "Halsua kk"
      :id 101532
      :lat [63.4669 63.467]
      :lon [24.16301 24.16311]
      :start 1972
      :end 2000 } 
{     :title "Leppävirta Sorsakoski Osmajärvi"
      :id 101408
      :lat [62.45 62.45]
      :lon [27.68 27.68]
      :start 1966
      :end 2000 } 
{     :title "Kajaani lentoasema"
      :id 101741
      :lat [64.28369 64.28379]
      :lon [27.6631 27.6632]
      :start 1998
      :end 2000 } 
{     :title "Valkeala Kouvola"
      :id 101199
      :lat [60.83352 60.83362]
      :lon [26.74681 26.74691]
      :start 1969
      :end 2000 } 
{     :title "Nivala"
      :id 101677
      :lat [63.91694 63.91704]
      :lon [24.96299 24.96309]
      :start 1965
      :end 2000 } 
{     :title "Kuusamo lentoasema"
      :id 101901
      :lat [65.9838 65.9839]
      :lon [29.22963 29.22973]
      :start 1999
      :end 2000 } 
{     :title "Keminmaa"
      :id 101849
      :lat [65.80035 65.80045]
      :lon [24.61269 24.61279]
      :start 1996
      :end 2000 } 
{     :title "Hämeenkyrö Kyröspohja"
      :id 101309
      :lat [61.61679 61.61689]
      :lon [23.1632 23.1633]
      :start 1992
      :end 2000 } 
{     :title "Laitila Palttila"
      :id 101060
      :lat [60.88338 60.88348]
      :lon [21.66323 21.66333]
      :start 1992
      :end 2000 } 
{     :title "Haapavesi Piipsanneva"
      :id 101707
      :lat [64.14112 64.14122]
      :lon [25.60133 25.60143]
      :start 1997
      :end 2000 } 
{     :title "Ylämaa Ylijärvi"
      :id 101233
      :lat [60.76689 60.76699]
      :lon [27.93021 27.93031]
      :start 1992
      :end 2000 } 
{     :title "Enontekiö Palojärvi"
      :id 102020
      :lat [68.56712 68.57172]
      :lon [23.32878 23.34555]
      :start 1972
      :end 2000 } 
{     :title "Suomussalmi kk"
      :id 101832
      :lat [64.90289 64.91966]
      :lon [29.01343 29.01353]
      :start 1959
      :end 2000 } 
{     :title "Kesälahti Mäntyniemi"
      :id 101454
      :lat [61.88081 61.88374]
      :lon [29.83019 29.83815]
      :start 1992
      :end 2000 } 
{     :title "Kumlinge Bärö"
      :id 100920
      :lat [60.30001 60.30011]
      :lon [20.74658 20.74668]
      :start 1983
      :end 2000 } 
{     :title "Lestijärvi kk"
      :id 101678
      :lat [63.51691 63.51701]
      :lon [24.66303 24.66313]
      :start 1965
      :end 2000 } 
{     :title "Vaala Jylhämä"
      :id 101801
      :lat [64.56701 64.56711]
      :lon [26.77967 26.77977]
      :start 1970
      :end 2000 } 
{     :title "Orivesi Uiherla"
      :id 101320
      :lat [61.55016 61.55026]
      :lon [24.52994 24.53004]
      :start 1961
      :end 2001 } 
{     :title "Vaasa Palosaari"
      :id 101480
      :lat [63.08347 63.10024]
      :lon [21.59625 21.59636]
      :start 1995
      :end 2001 } 
{     :title "Rovaniemi autosynop"
      :id 101930
      :lat [66.56707 66.56717]
      :lon [25.8292 25.8293]
      :start 1998
      :end 2001 } 
{     :title "Pudasjärvi Korpisenkylä"
      :id 101810
      :lat [65.10039 65.10049]
      :lon [27.52964 27.52974]
      :start 1965
      :end 2001 } 
{     :title "Lapua Tiistenjoki"
      :id 101515
      :lat [62.90019 62.90029]
      :lon [23.27971 23.27981]
      :start 1975
      :end 2001 } 
{     :title "Pyhäjärvi Ol Liittoperä"
      :id 101713
      :lat [63.75029 63.75039]
      :lon [26.21309 26.21319]
      :start 1965
      :end 2001 } 
{     :title "Maalahti Över-Malax"
      :id 101472
      :lat [62.95013 62.95023]
      :lon [21.62961 21.62971]
      :start 1969
      :end 2001 } 
{     :title "Rautavaara Puumala"
      :id 101605
      :lat [63.40034 63.40044]
      :lon [28.41327 28.41337]
      :start 1989
      :end 2001 } 
{     :title "Kylmäkoski Nauli"
      :id 101120
      :lat [61.13345 61.13355]
      :lon [23.66329 23.66339]
      :start 1992
      :end 2001 } 
{     :title "Vähäkyrö kk"
      :id 101497
      :lat [63.05015 63.05522]
      :lon [22.11296 22.11667]
      :start 1965
      :end 2001 } 
{     :title "Kalajoki Käännänkylä"
      :id 101682
      :lat [64.20026 64.20036]
      :lon [24.14623 24.14633]
      :start 1965
      :end 2001 } 
{     :title "Mustasaari Sulva Långmossen"
      :id 101471
      :lat [62.95013 62.95023]
      :lon [21.69628 21.69638]
      :start 1965
      :end 2001 } 
{     :title "Outokumpu Kokonvaara"
      :id 101613
      :lat [62.78366 62.78376]
      :lon [29.14672 29.14682]
      :start 1967
      :end 2001 } 
{     :title "Outokumpu Maljasalmi Sarvijärvi"
      :id 101595
      :lat [62.70032 62.70042]
      :lon [28.88004 28.88014]
      :start 1968
      :end 2001 } 
{     :title "Kittilä Pallasjärvi"
      :id 101984
      :lat [68.01711 68.01721]
      :lon [24.16229 24.16239]
      :start 1996
      :end 2002 } 
{     :title "Ylitornio Portimojärvi"
      :id 101839
      :lat [66.36702 66.36712]
      :lon [23.91255 23.91265]
      :start 1959
      :end 2002 } 
{     :title "Lieksa Hattusaari"
      :id 101625
      :lat [63.23189 63.23379]
      :lon [29.69669 29.71346]
      :start 1991
      :end 2002 } 
{     :title "Ylitornio Törmäsjärvi"
      :id 101843
      :lat [66.38369 66.38379]
      :lon [24.14589 24.14599]
      :start 1965
      :end 2002 } 
{     :title "Korpilahti Ylä-Muuratjärvi Rinteelä"
      :id 101351
      :lat [62.15021 62.15031]
      :lon [25.37992 25.38002]
      :start 1967
      :end 2002 } 
{     :title "Lieksa Hattuvaara"
      :id 101644
      :lat [63.28372 63.28382]
      :lon [30.53007 30.53017]
      :start 1974
      :end 2002 } 
{     :title "Sonkajärvi Jyrkkä"
      :id 101732
      :lat [63.77887 63.78377]
      :lon [27.80251 27.81328]
      :start 1970
      :end 2002 } 
{     :title "Ylöjärvi Taivalpohja"
      :id 101296
      :lat [61.68347 61.68357]
      :lon [23.62988 23.62998]
      :start 1965
      :end 2002 } 
{     :title "Kuusamo Kärpänkylä"
      :id 101889
      :lat [65.91715 65.91725]
      :lon [29.86302 29.86312]
      :start 1966
      :end 2002 } 
{     :title "Tervola Kätkävaara"
      :id 101848
      :lat [66.2337 66.2338]
      :lon [24.81263 24.81273]
      :start 1993
      :end 2002 } 
{     :title "Pyhäntä Viitamäki"
      :id 101722
      :lat [63.93364 63.93374]
      :lon [26.41307 26.41317]
      :start 1971
      :end 2002 } 
{     :title "Utsjoki Karigasniemi"
      :id 102022
      :lat [69.40054 69.40222]
      :lon [25.84863 25.86227]
      :start 1965
      :end 2002 } 
{     :title "Hattula Leteensuo"
      :id 101131
      :lat [61.0668 61.0669]
      :lon [24.22999 24.23009]
      :start 1959
      :end 2002 } 
{     :title "Kuopio autosynop"
      :id 101583
      :lat [63.01698 63.01708]
      :lon [27.79664 27.79674]
      :start 1998
      :end 2003 } 
{     :title "Inari Riutula"
      :id 102028
      :lat [68.93388 68.93398]
      :lon [26.81232 26.81242]
      :start 1965
      :end 2003 } 
{     :title "Asikkala maatal.oppilaitos"
      :id 101186
      :lat [61.21684 61.21694]
      :lon [25.4967 25.4968]
      :start 1992
      :end 2003 } 
{     :title "Sodankylä Vuotso virastotalo"
      :id 102003
      :lat [68.10171 68.10181]
      :lon [27.11942 27.11952]
      :start 1965
      :end 2003 } 
{     :title "Turku Kupittaa"
      :id 100948
      :lat [60.45005 60.45015]
      :lon [22.27996 22.28006]
      :start 1999
      :end 2003 } 
{     :title "Pihtipudas Ilosjoki"
      :id 101547
      :lat [63.29882 63.30036]
      :lon [25.64326 25.64655]
      :start 1970
      :end 2003 } 
{     :title "Rovaniemi Jaatila"
      :id 101856
      :lat [66.36706 66.36716]
      :lon [25.36265 25.36275]
      :start 1965
      :end 2003 } 
{     :title "Multia Sahrajärvi"
      :id 101358
      :lat [62.41688 62.44198]
      :lon [25.0132 25.01496]
      :start 1970
      :end 2003 } 
{     :title "Isojoki Vanhakylä"
      :id 101259
      :lat [62.18344 62.18354]
      :lon [21.79639 21.79649]
      :start 1965
      :end 2003 } 
{     :title "Lieksa Ruunaa"
      :id 101643
      :lat [63.43372 63.43382]
      :lon [30.43004 30.43014]
      :start 1970
      :end 2003 } 
{     :title "Somero Joensuu"
      :id 101109
      :lat [60.63342 60.63352]
      :lon [23.51334 23.51344]
      :start 1965
      :end 2004 } 
{     :title "Kemiö Mattkärr"
      :id 100938
      :lat [60.12949 60.13348]
      :lon [22.63001 22.64679]
      :start 1967
      :end 2004 } 
{     :title "Ristijärvi Kivikylä"
      :id 101751
      :lat [64.48371 64.48381]
      :lon [28.1631 28.1632]
      :start 1970
      :end 2004 } 
{     :title "Kittilä Alakylä"
      :id 101911
      :lat [67.28375 67.28385]
      :lon [24.87912 24.87922]
      :start 1969
      :end 2004 } 
{     :title "Pomarkku kk"
      :id 101275
      :lat [61.70009 61.70019]
      :lon [22.01314 22.01324]
      :start 1966
      :end 2004 } 
{     :title "Pello Turtolankylä"
      :id 101903
      :lat [66.58369 66.58379]
      :lon [23.89584 23.89594]
      :start 1965
      :end 2004 } 
{     :title "Närpiö Ylimarkku Bodbacka"
      :id 101469
      :lat [62.68344 62.68354]
      :lon [21.3463 21.3464]
      :start 1965
      :end 2004 } 
{     :title "Salla Kursu"
      :id 101953
      :lat [66.76715 66.76725]
      :lon [28.14611 28.14621]
      :start 1967
      :end 2004 } 
{     :title "Pello Ruuhijärvi"
      :id 101910
      :lat [66.8504 66.8505]
      :lon [24.66252 24.66262]
      :start 1965
      :end 2004 } 
{     :title "Posio"
      :id 101883
      :lat [66.12 66.12]
      :lon [28.14 28.15]
      :start 1970
      :end 2004 } 
{     :title "Suomussalmi Ämmänsaari"
      :id 101824
      :lat [64.88374 64.88384]
      :lon [28.9131 28.9132]
      :start 1976
      :end 2004 } 
{     :title "Inari Kuttura"
      :id 101999
      :lat [68.40051 68.40061]
      :lon [26.46239 26.46249]
      :start 1985
      :end 2004 } 
{     :title "Vihti Suontaka"
      :id 100979
      :lat [60.40011 60.40021]
      :lon [24.38007 24.38017]
      :start 1965
      :end 2004 } 
{     :title "Tarvasjoki Liedonperä"
      :id 101090
      :lat [60.60188 60.60198]
      :lon [22.6378 22.6379]
      :start 1971
      :end 2005 } 
{     :title "Sotkamo Laakajärvi"
      :id 101758
      :lat [63.79591 63.79601]
      :lon [28.22792 28.22802]
      :start 2003
      :end 2005 } 
{     :title "Salla Naruska"
      :id 101964
      :lat [67.15052 67.21562]
      :lon [29.16279 29.23733]
      :start 1965
      :end 2005 } 
{     :title "Ranua Palovaara"
      :id 101871
      :lat [66.13373 66.13383]
      :lon [26.11273 26.11283]
      :start 1976
      :end 2005 } 
{     :title "Hamina Poitsila"
      :id 101222
      :lat [60.55019 60.56696]
      :lon [27.14686 27.19697]
      :start 1966
      :end 2005 } 
{     :title "Kuopio keskusta"
      :id 101584
      :lat [62.88697 62.88709]
      :lon [27.6894 27.68953]
      :start 2001
      :end 2005 } 
{     :title "Kesälahti kk"
      :id 101443
      :lat [61.87942 61.87952]
      :lon [29.82882 29.82892]
      :start 1965
      :end 2005 } 
{     :title "Loppi Hevosoja"
      :id 101147
      :lat [60.66679 60.68578]
      :lon [24.34671 24.36181]
      :start 1970
      :end 2005 } 
{     :title "Sonkajärvi Sukeva"
      :id 101733
      :lat [63.88022 63.90044]
      :lon [27.43544 27.49657]
      :start 1970
      :end 2005 } 
{     :title "Kuivaniemi Oijärvi"
      :id 101857
      :lat [65.65037 65.65047]
      :lon [25.94612 25.94622]
      :start 1970
      :end 2005 } 
{     :title "Taivalkoski kk"
      :id 101879
      :lat [65.58376 65.58386]
      :lon [28.24629 28.24639]
      :start 1959
      :end 2005 } 
{     :title "Helsinki Herttoniemi"
      :id 101026
      :lat [60.20023 60.20033]
      :lon [25.0465 25.0466]
      :start 2002
      :end 2005 } 
{     :title "Alavus Kattelus"
      :id 101306
      :lat [62.4835 62.4836]
      :lon [23.76312 23.76322]
      :start 1963
      :end 2005 } 
{     :title "Kuhmalahti Puntari"
      :id 101333
      :lat [61.5 61.5]
      :lon [24.62 24.62]
      :start 1970
      :end 2005 } 
{     :title "Pohja Kuovila"
      :id 100964
      :lat [60.11674 60.11684]
      :lon [23.38005 23.38015]
      :start 1980
      :end 2005 } 
{     :title "Tyrnävä Leppioja"
      :id 101793
      :lat [64.80032 64.80042]
      :lon [25.57956 25.57966]
      :start 1992
      :end 2005 } 
{     :title "Laukaa Äijälä Hyyppäänmäki"
      :id 101558
      :lat [62.53357 62.53367]
      :lon [26.01324 26.01334]
      :start 1967
      :end 2005 } 
{     :title "Porvoo Jernböle"
      :id 101014
      :lat [60.40014 60.43358]
      :lon [25.6468 25.66357]
      :start 1959
      :end 2005 } 
{     :title "Evijärvi Lahdenkylä"
      :id 101514
      :lat [63.41687 63.43336]
      :lon [23.36297 23.41085]
      :start 1970
      :end 2005 } 
{     :title "Kaavi Sivakkavaara"
      :id 101624
      :lat [63.01217 63.01711]
      :lon [29.00679 29.01345]
      :start 1977
      :end 2005 } 
{     :title "Kuopio-Siilinjärvi lentoas. Sade"
      :id 101585
      :lat [63.01697 63.01707]
      :lon [27.79689 27.79699]
      :start 2005
      :end 2006 } 
{     :title "Savonranta Leivonmäki"
      :id 101447
      :lat [62.31698 62.31708]
      :lon [29.0801 29.0802]
      :start 1965
      :end 2006 } 
{     :title "Kemijärvi Halosenranta"
      :id 101948
      :lat [66.66713 66.66723]
      :lon [27.49608 27.49618]
      :start 1974
      :end 2006 } 
{     :title "Enontekiö Hetta lentoasema"
      :id 101976
      :lat [68.36238 68.36248]
      :lon [23.42715 23.42725]
      :start 1999
      :end 2006 } 
{     :title "Helsinki Malmi lentoasema"
      :id 101009
      :lat [60.25345 60.25355]
      :lon [25.0451 25.0452]
      :start 1959
      :end 2006 } 
{     :title "Inari Näätämö"
      :id 102056
      :lat [69.6698 69.68406]
      :lon [29.09264 29.12913]
      :start 1965
      :end 2006 } 
{     :title "Porvoo Lehtimäki"
      :id 101027
      :lat [60.36847 60.36857]
      :lon [25.62375 25.62385]
      :start 2006
      :end 2006 } 
{     :title "Pälkäne Myttäälä"
      :id 101134
      :lat [61.33347 61.33802]
      :lon [24.20745 24.21339]
      :start 1959
      :end 2006 } 
{     :title "Kyyjärvi kk"
      :id 101529
      :lat [63.03355 63.03365]
      :lon [24.56309 24.56319]
      :start 1970
      :end 2006 } 
{     :title "Juupajoki Sahrajärvi"
      :id 101324
      :lat [61.81684 61.81694]
      :lon [24.49658 24.49668]
      :start 1965
      :end 2006 } 
{     :title "Varpaisjärvi Pitkälänmäki"
      :id 101575
      :lat [63.38365 63.38375]
      :lon [27.64655 27.64665]
      :start 1965
      :end 2006 } 
{     :title "Reisjärvi Levonperä"
      :id 101697
      :lat [63.70026 63.71703]
      :lon [24.99635 25.02979]
      :start 1965
      :end 2006 } 
{     :title "Lammi Kostila"
      :id 101173
      :lat [61.12405 61.15026]
      :lon [25.13002 25.13319]
      :start 1968
      :end 2006 } 
{     :title "Pertunmaa Laukkala"
      :id 101393
      :lat [61.53152 61.53162]
      :lon [26.32732 26.32742]
      :start 1972
      :end 2006 } 
{     :title "Tampere Hatanpää"
      :id 101123
      :lat [61.48346 61.48695]
      :lon [23.76325 23.77018]
      :start 2000
      :end 2006 } 
{     :title "Mäntsälä Purola"
      :id 101183
      :lat [60.57876 60.58358]
      :lon [25.48816 25.49687]
      :start 1992
      :end 2006 } 
{     :title "Orivesi keskusta"
      :id 101322
      :lat [61.66683 61.66693]
      :lon [24.34659 24.34669]
      :start 1968
      :end 2006 } 
{     :title "Pyhäntä Tavastkenkä"
      :id 101724
      :lat [64.11699 64.11709]
      :lon [26.54639 26.54649]
      :start 1974
      :end 2006 } 
{     :title "Kannonkoski kk"
      :id 101542
      :lat [62.9669 62.967]
      :lon [25.24647 25.24657]
      :start 1965
      :end 2006 } 
{     :title "Kälviä Maunumäki"
      :id 101669
      :lat [63.88355 63.88365]
      :lon [23.42957 23.42967]
      :start 1965
      :end 2006 } 
{     :title "Inari Ivalo"
      :id 102037
      :lat [68.66722 68.67026]
      :lon [27.56243 27.56694]
      :start 1967
      :end 2006 } 
{     :title "Porvoo Norrveckoski"
      :id 101018
      :lat [60.38347 60.39338]
      :lon [25.41346 25.43092]
      :start 1968
      :end 2006 } 
{     :title "Jomala Södersunda"
      :id 100925
      :lat [60.14998 60.15425]
      :lon [19.87184 19.87999]
      :start 1995
      :end 2007 } 
{     :title "Pudasjärvi maatalousoppilaitos"
      :id 101804
      :lat [65.38372 65.39132]
      :lon [26.97956 26.98633]
      :start 1999
      :end 2007 } 
{     :title "Harjavalta Torttila"
      :id 101079
      :lat [61.31464 61.31685]
      :lon [22.11319 22.12381]
      :start 1965
      :end 2007 } 
{     :title "Mietoinen Saari"
      :id 101046
      :lat [60.62977 60.63348]
      :lon [21.85492 21.86336]
      :start 1959
      :end 2007 } 
{     :title "Virrat Jäähdyspohja"
      :id 101303
      :lat [62.21684 62.21694]
      :lon [23.82982 23.82992]
      :start 1966
      :end 2007 } 
{     :title "Mikkeli Pitkäaho"
      :id 101415
      :lat [61.95025 61.95035]
      :lon [27.26338 27.26348]
      :start 1980
      :end 2007 } 
{     :title "Luumäki Saareks"
      :id 101227
      :lat [61.00021 61.00031]
      :lon [27.21349 27.21359]
      :start 1965
      :end 2007 } 
{     :title "Suomussalmi Ylivuokki"
      :id 101833
      :lat [64.71709 64.71719]
      :lon [29.67983 29.67993]
      :start 1966
      :end 2007 } 
{     :title "Kotka Pookinmäki"
      :id 101040
      :lat [60.45018 60.45445]
      :lon [26.94686 26.94974]
      :start 1994
      :end 2007 } 
{     :title "Kuru Länsi-Aure"
      :id 101293
      :lat [61.94914 61.98357]
      :lon [23.3465 23.37993]
      :start 1959
      :end 2007 } 
{     :title "Kuhmo keskusta"
      :id 101762
      :lat [64.11707 64.13383]
      :lon [29.47039 29.54667]
      :start 1959
      :end 2007 } 
{     :title "Hattula Lepaa"
      :id 101132
      :lat [61.11304 61.12746]
      :lon [24.32595 24.33287]
      :start 1959
      :end 2007 } 
{     :title "Orimattila Käkelä"
      :id 101153
      :lat [60.80016 60.80665]
      :lon [25.76343 25.76908]
      :start 1960
      :end 2007 } 
{     :title "Hollola kk"
      :id 101160
      :lat [61.06739 61.06749]
      :lon [25.41421 25.41431]
      :start 1964
      :end 2007 } 
{     :title "Lappi Kaukola"
      :id 101052
      :lat [61.06674 61.06684]
      :lon [21.91321 21.91331]
      :start 1965
      :end 2007 } 
{     :title "Rauma Äyhö"
      :id 101054
      :lat [61.15612 61.15622]
      :lon [21.57297 21.57307]
      :start 1965
      :end 2007 } 
{     :title "Tuulos Teuro"
      :id 101144
      :lat [61.07653 61.07663]
      :lon [24.83278 24.83288]
      :start 1965
      :end 2007 } 
{     :title "Vilppula kk"
      :id 101326
      :lat [62.01685 62.01695]
      :lon [24.51323 24.51333]
      :start 1965
      :end 2007 } 
{     :title "Keuruu Pihlajavesi"
      :id 101332
      :lat [62.33351 62.33361]
      :lon [24.2965 24.2966]
      :start 1965
      :end 2007 } 
{     :title "Sulkava Kaipola"
      :id 101424
      :lat [61.81695 61.81705]
      :lon [28.43012 28.43022]
      :start 1965
      :end 2007 } 
{     :title "Närpiö Pirttikylä"
      :id 101470
      :lat [62.73056 62.73355]
      :lon [21.64631 21.65605]
      :start 1965
      :end 2007 } 
{     :title "Viitasaari Huopana"
      :id 101543
      :lat [63.05025 63.05035]
      :lon [25.5298 25.5299]
      :start 1965
      :end 2007 } 
{     :title "Simo Simoniemi"
      :id 101841
      :lat [65.65035 65.65045]
      :lon [24.89606 24.89616]
      :start 1965
      :end 2007 } 
{     :title "Ylistaro Kainasto"
      :id 101495
      :lat [62.92 62.92]
      :lon [22.61 22.61]
      :start 1966
      :end 2007 } 
{     :title "Lohtaja Marinkainen"
      :id 101671
      :lat [63.95023 63.95033]
      :lon [23.4629 23.463]
      :start 1966
      :end 2007 } 
{     :title "Rantasalmi Tuusmäki"
      :id 101426
      :lat [61.9836 61.9837]
      :lon [28.04675 28.04685]
      :start 1966
      :end 2007 } 
{     :title "Hartola Hotila"
      :id 101343
      :lat [61.54364 61.5503]
      :lon [25.96336 25.96657]
      :start 1966
      :end 2007 } 
{     :title "Konnevesi Lahdenkylä"
      :id 101559
      :lat [62.56692 62.56702]
      :lon [26.27991 26.28001]
      :start 1967
      :end 2007 } 
{     :title "Asikkala Pulkkilanharju"
      :id 101156
      :lat [61.28351 61.30084]
      :lon [25.54253 25.5468]
      :start 1967
      :end 2007 } 
{     :title "Hartola Ruskeala"
      :id 101372
      :lat [61.6002 61.60474]
      :lon [26.01336 26.01479]
      :start 1968
      :end 2007 } 
{     :title "Joutsa Mieskonmäki Säynätniemi"
      :id 101381
      :lat [61.80022 61.80032]
      :lon [26.21334 26.21344]
      :start 1968
      :end 2007 } 
{     :title "Hartola Putkijärvi"
      :id 101346
      :lat [61.7502 61.7503]
      :lon [25.87999 25.88009]
      :start 1968
      :end 2007 } 
{     :title "Karstula kk"
      :id 101525
      :lat [62.86689 62.86699]
      :lon [24.79646 24.79656]
      :start 1968
      :end 2007 } 
{     :title "Joutsa Mieskonmäki Kälä"
      :id 101383
      :lat [61.85022 61.85032]
      :lon [26.26334 26.26344]
      :start 1968
      :end 2007 } 
{     :title "Joutsa Uimaniemi"
      :id 101377
      :lat [61.68354 61.70031]
      :lon [26.26336 26.26346]
      :start 1968
      :end 2007 } 
{     :title "Somero Suojoki"
      :id 101107
      :lat [60.51676 60.5188]
      :lon [23.6753 23.68012]
      :start 1968
      :end 2007 } 
{     :title "Hämeenkoski Palomaa"
      :id 101159
      :lat [61.05016 61.06329]
      :lon [25.24421 25.24681]
      :start 1969
      :end 2007 } 
{     :title "Puumala Sorjola"
      :id 101422
      :lat [61.56687 61.56703]
      :lon [28.07563 28.08023]
      :start 1970
      :end 2007 } 
{     :title "Hollola Toivola"
      :id 101178
      :lat [61.00016 61.00026]
      :lon [25.28004 25.28014]
      :start 1972
      :end 2007 } 
{     :title "Rovaniemi Kilvenaapa"
      :id 101870
      :lat [66.20329 66.20339]
      :lon [26.21173 26.21183]
      :start 1974
      :end 2007 } 
{     :title "Kemijärvi Lehtosalmi"
      :id 101949
      :lat [66.53379 66.56723]
      :lon [27.6961 27.76288]
      :start 1981
      :end 2007 } 
{     :title "Sodankylä Madetkoski"
      :id 101998
      :lat [67.92933 67.93393]
      :lon [26.7701 26.77925]
      :start 1981
      :end 2007 } 
{     :title "Karijoki Kankalo"
      :id 101266
      :lat [62.31678 62.32113]
      :lon [21.84491 21.84648]
      :start 1993
      :end 2007 } 
{     :title "Kolari Venejärvi"
      :id 101917
      :lat [67.28373 67.28383]
      :lon [24.19575 24.19585]
      :start 1995
      :end 2007 } 
{     :title "Ruotsinpyhtää Keitala"
      :id 101033
      :lat [60.41684 60.42221]
      :lon [26.36601 26.38027]
      :start 1971
      :end 2008 } 
{     :title "Varpaisjärvi Kärsämäki"
      :id 101600
      :lat [63.367 63.3671]
      :lon [27.99657 27.99667]
      :start 1970
      :end 2008 } 
{     :title "Rovaniemi Pirttikoski"
      :id 101875
      :lat [66.35043 66.35053]
      :lon [27.1461 27.1462]
      :start 1965
      :end 2008 } 
{     :title "Äänekoski keskusta"
      :id 101539
      :lat [62.60023 62.60033]
      :lon [25.71321 25.71331]
      :start 1965
      :end 2008 } 
{     :title "Sodankylä AWS"
      :id 101941
      :lat [67.36836 67.36846]
      :lon [26.62868 26.62878]
      :start 2001
      :end 2008 } 
{     :title "Halsua Kanala Koski"
      :id 101527
      :lat [63.43356 63.43366]
      :lon [24.49636 24.49646]
      :start 1965
      :end 2008 } 
{     :title "Miehikkälä Hauhia"
      :id 101225
      :lat [60.71688 60.71698]
      :lon [27.69688 27.69698]
      :start 1965
      :end 2008 } 
{     :title "Lammi Jahkola"
      :id 101174
      :lat [61.03348 61.04164]
      :lon [25.01156 25.01347]
      :start 1968
      :end 2008 } 
{     :title "Utsjoki Karigasniemi"
      :id 102025
      :lat [69.43249 69.43259]
      :lon [25.81515 25.81525]
      :start 2001
      :end 2008 } 
{     :title "Varkaus Käpykangas"
      :id 101400
      :lat [62.30028 62.33371]
      :lon [27.84114 27.88013]
      :start 1959
      :end 2008 } 
{     :title "Lammi Tirmula"
      :id 101162
      :lat [61.05937 61.06692]
      :lon [24.9967 24.99683]
      :start 1968
      :end 2008 } 
{     :title "Kittilä Pulju"
      :id 101980
      :lat [68.2303 68.2339]
      :lon [24.82896 24.83731]
      :start 1974
      :end 2008 } 
{     :title "Alajärvi Möksy"
      :id 101522
      :lat [63.05021 63.08364]
      :lon [24.26307 24.27984]
      :start 1959
      :end 2008 } 
{     :title "Muhos kk Laitasaari"
      :id 101788
      :lat [64.81525 64.8171]
      :lon [25.97958 25.97974]
      :start 1959
      :end 2008 } 
{     :title "Tammisaari Bromarv Vättlax"
      :id 100937
      :lat [59.93427 59.93437]
      :lon [22.92761 22.92771]
      :start 1961
      :end 2008 } 
{     :title "Artjärvi kk"
      :id 101197
      :lat [60.74706 60.75027]
      :lon [26.07797 26.08021]
      :start 1961
      :end 2008 } 
{     :title "Anjalankoski Rautakorpi"
      :id 101198
      :lat [60.76686 60.76696]
      :lon [26.76349 26.76359]
      :start 1961
      :end 2008 } 
{     :title "Houtskari Hyppeis"
      :id 100912
      :lat [60.21669 60.21679]
      :lon [21.26328 21.26338]
      :start 1963
      :end 2008 } 
{     :title "Ranua kk"
      :id 101861
      :lat [65.93293 65.93303]
      :lon [26.51265 26.54608]
      :start 1963
      :end 2008 } 
{     :title "Hirvensalmi Puukonsaari"
      :id 101380
      :lat [61.80023 61.80033]
      :lon [26.84671 26.84681]
      :start 1964
      :end 2008 } 
{     :title "Geta Östergeta"
      :id 100914
      :lat [60.38332 60.38342]
      :lon [19.9132 19.9133]
      :start 1965
      :end 2008 } 
{     :title "Merimasku Sannainen"
      :id 100916
      :lat [60.4514 60.4515]
      :lon [21.84768 21.84778]
      :start 1965
      :end 2008 } 
{     :title "Porvoo Bengtsby"
      :id 101017
      :lat [60.26389 60.26691]
      :lon [25.63015 25.63439]
      :start 1965
      :end 2008 } 
{     :title "Kustavi Kivimaa"
      :id 101048
      :lat [60.55003 60.55013]
      :lon [21.36325 21.36335]
      :start 1965
      :end 2008 } 
{     :title "Lappi Kulanperä"
      :id 101053
      :lat [61.11673 61.11835]
      :lon [21.74653 21.7591]
      :start 1965
      :end 2008 } 
{     :title "Koski Sorvasto"
      :id 101110
      :lat [60.69703 60.69713]
      :lon [23.13107 23.13117]
      :start 1965
      :end 2008 } 
{     :title "Padasjoki Syrjäntaka"
      :id 101165
      :lat [61.36231 61.36694]
      :lon [25.22834 25.2301]
      :start 1965
      :end 2008 } 
{     :title "Virolahti Ravijoki"
      :id 101220
      :lat [60.53353 60.53363]
      :lon [27.54689 27.54699]
      :start 1965
      :end 2008 } 
{     :title "Anjalankoski Sippola Hirvelä"
      :id 101226
      :lat [60.7502 60.7503]
      :lon [27.08017 27.08027]
      :start 1965
      :end 2008 } 
{     :title "Mäntyharju Halmeniemi"
      :id 101229
      :lat [61.28355 61.28365]
      :lon [27.21346 27.21356]
      :start 1965
      :end 2008 } 
{     :title "Hankasalmi Säkinmäki"
      :id 101389
      :lat [62.48358 62.48368]
      :lon [26.46327 26.46337]
      :start 1965
      :end 2008 } 
{     :title "Pieksämäki Bovallius ammattiopisto"
      :id 101407
      :lat [62.28359 62.28369]
      :lon [27.16333 27.16343]
      :start 1965
      :end 2008 } 
{     :title "Kerimäki Rauvanniemi"
      :id 101445
      :lat [61.96698 61.96708]
      :lon [29.4635 29.48026]
      :start 1965
      :end 2008 } 
{     :title "Ii Yli-Olhava"
      :id 101859
      :lat [65.53369 65.53379]
      :lon [25.49611 25.49621]
      :start 1965
      :end 2008 } 
{     :title "Karvia kk"
      :id 101281
      :lat [62.13174 62.13356]
      :lon [22.54644 22.56121]
      :start 1965
      :end 2008 } 
{     :title "Karttula kk"
      :id 101560
      :lat [62.91695 62.91705]
      :lon [26.9799 26.98]
      :start 1965
      :end 2008 } 
{     :title "Pulkkila kk"
      :id 101703
      :lat [64.26698 64.28374]
      :lon [25.86299 25.89642]
      :start 1965
      :end 2008 } 
{     :title "Kylmäkoski Jokihaavisto"
      :id 101112
      :lat [61.10687 61.15022]
      :lon [23.66329 23.67678]
      :start 1965
      :end 2008 } 
{     :title "Multia Vehkoo"
      :id 101523
      :lat [62.51687 62.51697]
      :lon [24.6965 24.6966]
      :start 1965
      :end 2008 } 
{     :title "Sotkamo Vihtamojärvi"
      :id 101747
      :lat [64.20037 64.20047]
      :lon [28.32981 28.32991]
      :start 1965
      :end 2008 } 
{     :title "Mäntyharju Toivola"
      :id 101208
      :lat [61.50022 61.50032]
      :lon [26.7134 26.7135]
      :start 1965
      :end 2008 } 
{     :title "Rymättylä kk"
      :id 100915
      :lat [60.40004 60.40014]
      :lon [21.9633 21.9634]
      :start 1965
      :end 2008 } 
{     :title "Kauhajoki Nummijärvi"
      :id 101282
      :lat [62.28346 62.28356]
      :lon [22.39641 22.39651]
      :start 1965
      :end 2008 } 
{     :title "Maalahti Bergö"
      :id 101473
      :lat [62.9684 62.9685]
      :lon [21.20136 21.20146]
      :start 1965
      :end 2008 } 
{     :title "Petäjävesi Kuivasmäki"
      :id 101355
      :lat [62.33354 62.33364]
      :lon [25.14655 25.14665]
      :start 1965
      :end 2008 } 
{     :title "Uusikaarlepyy Jepua Jungar"
      :id 101501
      :lat [63.40018 63.40028]
      :lon [22.64627 22.64637]
      :start 1965
      :end 2008 } 
{     :title "Korppoo Korpogård"
      :id 100911
      :lat [60.1667 60.1668]
      :lon [21.5633 21.5634]
      :start 1965
      :end 2008 } 
{     :title "Luoto Eugmo"
      :id 101656
      :lat [63.8002 63.8003]
      :lon [22.74621 22.74631]
      :start 1965
      :end 2008 } 
{     :title "Nummi-Pusula Kärkölä"
      :id 101108
      :lat [60.629 60.6291]
      :lon [23.92056 23.92066]
      :start 1966
      :end 2008 } 
{     :title "Nilsiä Pieksä"
      :id 101596
      :lat [63.10032 63.10042]
      :lon [28.06328 28.06338]
      :start 1966
      :end 2008 } 
{     :title "Jalasjärvi Koskue"
      :id 101283
      :lat [62.31681 62.31691]
      :lon [22.8631 22.8632]
      :start 1966
      :end 2008 } 
{     :title "Loppi Vojakkala"
      :id 101138
      :lat [60.78 60.78]
      :lon [24.16 24.16]
      :start 1966
      :end 2008 } 
{     :title "Pälkäne Padankoski"
      :id 101146
      :lat [61.35016 61.3537]
      :lon [24.81332 24.82092]
      :start 1967
      :end 2008 } 
{     :title "Uusikaupunki Korsaari"
      :id 101051
      :lat [60.84557 60.86681]
      :lon [21.22987 21.23964]
      :start 1968
      :end 2008 } 
{     :title "Suomussalmi Piispajärvi Selkoskylä"
      :id 101834
      :lat [65.36711 65.37248]
      :lon [29.21305 29.21848]
      :start 1969
      :end 2008 } 
{     :title "Oravainen Kimo"
      :id 101487
      :lat [63.26684 63.30027]
      :lon [22.39627 22.4297]
      :start 1970
      :end 2008 } 
{     :title "Oulainen Ohineva"
      :id 101687
      :lat [64.23103 64.23371]
      :lon [24.8796 24.88284]
      :start 1970
      :end 2008 } 
{     :title "Ylikiiminki Nuoritta"
      :id 101803
      :lat [65.0837 65.0838]
      :lon [26.46293 26.46303]
      :start 1971
      :end 2008 } 
{     :title "Rautalampi Rastu"
      :id 101565
      :lat [62.71024 62.71704]
      :lon [26.77465 26.78002]
      :start 1975
      :end 2008 } 
{     :title "Ylöjärvi Viljakkala"
      :id 101308
      :lat [61.80014 61.80024]
      :lon [23.49653 23.49663]
      :start 1979
      :end 2008 } 
{     :title "Kärkölä Järvelä"
      :id 101179
      :lat [60.85015 60.88358]
      :lon [25.24673 25.2635]
      :start 1980
      :end 2008 } 
{     :title "Joensuu Keskijärvi"
      :id 101648
      :lat [62.56701 62.56711]
      :lon [30.28015 30.28025]
      :start 1985
      :end 2008 } 
{     :title "Ruovesi Kekkonen"
      :id 101334
      :lat [61.88541 61.88551]
      :lon [24.01677 24.03354]
      :start 1986
      :end 2008 } 
{     :title "Hyrynsalmi Hoikka"
      :id 101828
      :lat [64.71707 64.71717]
      :lon [28.62976 28.62986]
      :start 1991
      :end 2008 } 
{     :title "Saarijärvi Kalmari"
      :id 101551
      :lat [62.78355 62.78365]
      :lon [25.01315 25.01325]
      :start 1992
      :end 2008 } 
{     :title "Huittinen Raskala"
      :id 101097
      :lat [61.23343 61.23353]
      :lon [22.86324 22.86334]
      :start 1992
      :end 2008 } 
{     :title "Sonkajärvi Aittokoski"
      :id 101740
      :lat [63.70399 63.70409]
      :lon [27.41761 27.41771]
      :start 1995
      :end 2008 } 
{     :title "Joroinen Kiekka"
      :id 101419
      :lat [62.2336 62.2337]
      :lon [27.58002 27.58012]
      :start 1995
      :end 2008 } 
{     :title "Iisalmi keskusta"
      :id 101727
      :lat [63.58059 63.58069]
      :lon [27.17652 27.17662]
      :start 1965
      :end 2008 } 
{     :title "Helsinki Isosaari"
      :id 101024
      :lat [60.10012 60.10439]
      :lon [25.06792 25.08024]
      :start 1984
      :end 2008 } 
{     :title "Lahti Jalkaranta"
      :id 101187
      :lat [60.9835 60.99163]
      :lon [25.60126 25.61351]
      :start 1995
      :end 2008 } 
{     :title "Rovaniemi Lehtojärvi"
      :id 101922
      :lat [66.61151 66.61717]
      :lon [25.36261 25.37243]
      :start 1966
      :end 2008 } 
{     :title "Tornio Liakka"
      :id 101847
      :lat [65.88867 65.88877]
      :lon [24.27071 24.27081]
      :start 1992
      :end 2008 } 
{     :title "Eno Kaltimo"
      :id 101646
      :lat [62.78369 62.78379]
      :lon [30.1301 30.1302]
      :start 1981
      :end 2008 } 
{     :title "Eno Pamilo Luhtapohja"
      :id 101639
      :lat [62.80037 62.80047]
      :lon [30.41346 30.41356]
      :start 1961
      :end 2008 } 
{     :title "Mikkeli Anttola Pihlajasalo"
      :id 101404
      :lat [61.66692 61.66702]
      :lon [27.79677 27.79687]
      :start 1961
      :end 2008 } 
{     :title "Valkeala Kouvolankylä"
      :id 101212
      :lat [60.85019 60.85029]
      :lon [26.78014 26.78024]
      :start 1965
      :end 2008 } 
{     :title "Virolahti Nopala"
      :id 101223
      :lat [60.63353 60.63363]
      :lon [27.44687 27.44697]
      :start 1965
      :end 2008 } 
{     :title "Korpilahti Muuratjärvi Varrasmäki"
      :id 101350
      :lat [62.13354 62.13364]
      :lon [25.37992 25.38002]
      :start 1965
      :end 2008 } 
{     :title "Ylistaro Jääskänjoki"
      :id 101492
      :lat [62.88348 62.88358]
      :lon [22.52966 22.52976]
      :start 1965
      :end 2008 } 
{     :title "Mustasaari Sulva Forsbacken"
      :id 101475
      :lat [62.9668 62.98356]
      :lon [21.67961 21.71305]
      :start 1965
      :end 2008 } 
{     :title "Utsjoki Outakoski"
      :id 102023
      :lat [69.58389 69.58399]
      :lon [25.96214 25.96224]
      :start 1965
      :end 2008 } 
{     :title "Nurmijärvi Rajamäki"
      :id 101136
      :lat [60.53345 60.53355]
      :lon [24.74674 24.74684]
      :start 1965
      :end 2008 } 
{     :title "Orivesi Yliskylä"
      :id 101321
      :lat [61.63349 61.63359]
      :lon [24.29659 24.29669]
      :start 1965
      :end 2008 } 
{     :title "Jämijärvi Pirttijärvi"
      :id 101278
      :lat [61.73344 61.73354]
      :lon [22.71317 22.71327]
      :start 1966
      :end 2008 } 
{     :title "Kälviä Ruotsalo"
      :id 101670
      :lat [63.91689 63.91699]
      :lon [23.39623 23.39633]
      :start 1966
      :end 2008 } 
{     :title "Ruokolahti Kotalahti Sipinen"
      :id 101242
      :lat [61.38359 61.38369]
      :lon [28.66353 28.66363]
      :start 1967
      :end 2008 } 
{     :title "Outokumpu Maljasalmi Voutilainen"
      :id 101594
      :lat [62.70032 62.70042]
      :lon [28.89671 28.89681]
      :start 1967
      :end 2008 } 
{     :title "Alavus Pollari"
      :id 101505
      :lat [62.51684 62.51694]
      :lon [23.69645 23.69655]
      :start 1967
      :end 2008 } 
{     :title "Ilmajoki Hiiripelto"
      :id 101491
      :lat [62.83349 62.83359]
      :lon [22.64635 22.64645]
      :start 1968
      :end 2008 } 
{     :title "Ylistaro asemanseutu"
      :id 101493
      :lat [62.90016 62.90026]
      :lon [22.54633 22.54643]
      :start 1968
      :end 2008 } 
{     :title "Kokkola Kälviä"
      :id 101668
      :lat [63.86689 63.86699]
      :lon [23.42957 23.42967]
      :start 1968
      :end 2008 } 
{     :title "Nousiainen Koljola"
      :id 101071
      :lat [60.61673 60.61683]
      :lon [22.11328 22.11338]
      :start 1969
      :end 2008 } 
{     :title "Hamina Onkamaa"
      :id 101224
      :lat [60.6502 60.6503]
      :lon [27.41354 27.41364]
      :start 1969
      :end 2008 } 
{     :title "Pielavesi Säviä"
      :id 101564
      :lat [63.20028 63.20038]
      :lon [26.66319 26.66329]
      :start 1970
      :end 2008 } 
{     :title "Pyhäjärvi Ol Ramila Kuusenmäki"
      :id 101723
      :lat [63.70029 63.70039]
      :lon [26.2131 26.2132]
      :start 1971
      :end 2008 } 
{     :title "Raahe Pattijoki"
      :id 101782
      :lat [64.65029 64.65039]
      :lon [24.72953 24.72963]
      :start 1973
      :end 2008 } 
{     :title "Simo Maksniemi"
      :id 101845
      :lat [65.68367 65.68377]
      :lon [24.77938 24.77948]
      :start 1976
      :end 2008 } 
{     :title "Vihti Vanhala"
      :id 100992
      :lat [60.41486 60.41688]
      :lon [24.29673 24.2995]
      :start 1981
      :end 2008 } 
{     :title "Kauhajoki Muurahainen"
      :id 101290
      :lat [62.15012 62.15022]
      :lon [22.26307 22.26317]
      :start 1989
      :end 2008 } 
{     :title "Nilsiä Vuotjärvi"
      :id 101604
      :lat [63.20033 63.20043]
      :lon [28.26328 28.26338]
      :start 1989
      :end 2008 } 
{     :title "Alavus Autionmäki"
      :id 101507
      :lat [62.55017 62.55027]
      :lon [23.64644 23.64654]
      :start 1961
      :end 2009 } 
{     :title "Espoo Nupuri"
      :id 100986
      :lat [60.21678 60.22104]
      :lon [24.59677 24.60131]
      :start 1972
      :end 2009 } 
{     :title "Hämeenlinna Lammi Iso-Evo"
      :id 101184
      :lat [61.18294 61.18304]
      :lon [25.03666 25.03676]
      :start 1989
      :end 2009 } 
{     :title "Naantali Raula"
      :id 100923
      :lat [60.39393 60.40014]
      :lon [21.9431 21.94673]
      :start 1992
      :end 2009 } 
{     :title "Kittilä Tepsa"
      :id 101995
      :lat [67.56112 67.56122]
      :lon [25.68747 25.68757]
      :start 1977
      :end 2009 } 
{     :title "Hyrynsalmi Kytömäki"
      :id 101829
      :lat [64.8295 64.83382]
      :lon [28.22972 28.23305]
      :start 1992
      :end 2009 } 
{     :title "Kemiönsaari Lövböle"
      :id 100944
      :lat [60.15005 60.15321]
      :lon [22.55779 22.56345]
      :start 1984
      :end 2009 } 
{     :title "Inari Sevettijärvi"
      :id 102051
      :lat [69.50812 69.50822]
      :lon [28.59315 28.59325]
      :start 1986
      :end 2009 } 
{     :title "Keminmaa Liedakkala"
      :id 101842
      :lat [65.76701 65.85045]
      :lon [24.57934 24.57945]
      :start 1965
      :end 2009 } 
{     :title "Luhanka kirkonkylä"
      :id 101347
      :lat [61.78353 61.79113]
      :lon [25.67998 25.68203]
      :start 1965
      :end 2009 } 
{     :title "Savukoski Ainijärvi"
      :id 102013
      :lat [67.76722 67.76732]
      :lon [29.44605 29.44615]
      :start 1992
      :end 2009 } 
{     :title "Rovaniemi Juotasniemi"
      :id 101864
      :lat [66.3171 66.32331]
      :lon [26.93276 26.96286]
      :start 1965
      :end 2009 } 
{     :title "Hankasalmi"
      :id 101391
      :lat [62.30607 62.31701]
      :lon [26.48607 26.49672]
      :start 1970
      :end 2009 } 
{     :title "Luvia Peränkylä"
      :id 101055
      :lat [61.32954 61.3335]
      :lon [21.65344 21.66327]
      :start 1965
      :end 2010 } 
{     :title "Yli-Ii kk"
      :id 101792
      :lat [65.36703 65.36713]
      :lon [25.84616 25.84626]
      :start 1965
      :end 2010 } 
{     :title "Salla Salmivaara Lakijänkä"
      :id 101955
      :lat [66.81243 66.81253]
      :lon [28.29194 28.29204]
      :start 1965
      :end 2010 } 
{     :title "Savukoski Värriö"
      :id 101957
      :lat [67.46718 67.46867]
      :lon [27.99182 27.99609]
      :start 1965
      :end 2010 } 
{     :title "Savonlinna Ruunavuori"
      :id 101434
      :lat [61.84084 61.84094]
      :lon [28.84043 28.84053]
      :start 1991
      :end 2010 } 
{     :title "Mikkeli Otava"
      :id 101403
      :lat [61.66134 61.667]
      :lon [27.0634 27.07183]
      :start 1969
      :end 2010 } 
{     :title "Turku lentoasema"
      :id 101065
      :lat [60.51534 60.51544]
      :lon [22.2741 22.2742]
      :start 1959
      :end 2011 } 
{     :title "Oulu lentoasema"
      :id 101786
      :lat [64.92894 64.92904]
      :lon [25.34705 25.34715]
      :start 1959
      :end 2011 } 
{     :title "Vaasa lentoasema"
      :id 101462
      :lat [63.04192 63.04202]
      :lon [21.76407 21.76417]
      :start 1959
      :end 2011 } 
{     :title "Pori lentoasema"
      :id 101044
      :lat [61.46564 61.46574]
      :lon [21.7934 21.7935]
      :start 1959
      :end 2011 } 
{     :title "Inari Kirakkajärvi Sanilanlampi"
      :id 102053
      :lat [69.57618 69.58405]
      :lon [28.84319 28.84579]
      :start 1993
      :end 2011 } 
{     :title "Outokumpu Taipale Mustapuro"
      :id 101614
      :lat [62.79658 62.79668]
      :lon [29.18534 29.18544]
      :start 1965
      :end 2011 } 
{     :title "Jämsä Himos"
      :id 101364
      :lat [61.88603 61.88613]
      :lon [25.32661 25.32671]
      :start 1997
      :end 2011 } 
{     :title "Taipalsaari Kyläniemi"
      :id 101245
      :lat [61.30497 61.30507]
      :lon [28.17906 28.17916]
      :start 1991
      :end 2011 } 
{     :title "Vaasa keskusta Koulukatu"
      :id 101482
      :lat [63.09709 63.09719]
      :lon [21.60542 21.60552]
      :start 2001
      :end 2011 } 
{     :title "Outokumpu Sysmänkylä Suvisranta"
      :id 101612
      :lat [62.66699 62.66709]
      :lon [29.03007 29.03017]
      :start 1965
      :end 2011 } 
{     :title "Muhos Leppiniemi"
      :id 101802
      :lat [64.84284 64.84294]
      :lon [26.04099 26.04109]
      :start 1970
      :end 2011 } 
{     :title "Salo Suomusjärvi"
      :id 100961
      :lat [60.32398 60.32408]
      :lon [23.7067 23.7068]
      :start 1988
      :end 2012 } 
{     :title "Hyrynsalmi Moisiovaara"
      :id 101835
      :lat [64.58374 64.59634]
      :lon [29.11315 29.12658]
      :start 1970
      :end 2012 } 
{     :title "Alajärvi Lippo"
      :id 101524
      :lat [62.78611 62.78621]
      :lon [24.00391 24.00401]
      :start 1965
      :end 2012 } 
{     :title "Kristiinankaupunki Karhusaari"
      :id 101263
      :lat [62.25009 62.25769]
      :lon [21.31303 21.32979]
      :start 1974
      :end 2012 } 
{     :title "Jokioinen Jokioisten observatorio AWS"
      :id 101122
      :lat [60.81399 60.81409]
      :lon [23.49755 23.49765]
      :start 1995
      :end 2012 } 
{     :title "Rovaniemi Misi"
      :id 101935
      :lat [66.62516 66.63387]
      :lon [26.66269 26.68169]
      :start 1968
      :end 2013 } 
{     :title "Närpiö Alamarkku"
      :id 101468
      :lat [62.65012 62.65022]
      :lon [21.54632 21.54642]
      :start 1968
      :end 2013 } 
{     :title "Karttula Kallioranta"
      :id 101579
      :lat [62.85029 62.85039]
      :lon [27.27994 27.28004]
      :start 1982
      :end 2013 } 
{     :title "Kangasniemi kirkonkylä"
      :id 101385
      :lat [61.98 61.98]
      :lon [26.63 26.64]
      :start 1965
      :end 2013 } 
{     :title "Savonlinna Savonranta"
      :id 101448
      :lat [62.16892 62.18374]
      :lon [29.19679 29.27718]
      :start 1970
      :end 2013 } 
{     :title "Utsjoki Leppälä"
      :id 102040
      :lat [69.66364 69.66374]
      :lon [27.07354 27.07364]
      :start 1969
      :end 2013 } 
{     :title "Liperi Joensuun lentoasema"
      :id 101608
      :lat [62.65989 62.65999]
      :lon [29.61143 29.61153]
      :start 1959
      :end 10000} 
{     :title "Lemland Nyhamn"
      :id 100909
      :lat [59.95905 59.96674]
      :lon [19.94658 19.96336]
      :start 1959
      :end 10000} 
{     :title "Hailuoto Ojakylä"
      :id 101776
      :lat [65.01698 65.03374]
      :lon [24.71281 24.77957]
      :start 1959
      :end 10000} 
{     :title "Kaarina Yltöinen"
      :id 100934
      :lat [60.38339 60.38683]
      :lon [22.54665 22.55147]
      :start 1959
      :end 10000} 
{     :title "Jokioinen Jokioisten observatorio"
      :id 101104
      :lat [60.81396 60.81406]
      :lon [23.49756 23.49766]
      :start 1959
      :end 10000} 
{     :title "Kouvola Utti lentokenttä"
      :id 101191
      :lat [60.89048 60.9003]
      :lon [26.93014 26.94109]
      :start 1959
      :end 10000} 
{     :title "Ähtäri Myllymäki"
      :id 101520
      :lat [62.53352 62.53501]
      :lon [24.11314 24.2174]
      :start 1959
      :end 10000} 
{     :title "Salo Kärkkä"
      :id 100955
      :lat [60.36674 60.37378]
      :lon [23.09668 23.11289]
      :start 1959
      :end 10000} 
{     :title "Sodankylä Lokka"
      :id 102000
      :lat [67.82049 67.82156]
      :lon [27.73688 27.7464]
      :start 1959
      :end 10000} 
{     :title "Sodankylä Vuotso"
      :id 102001
      :lat [68.08417 68.10259]
      :lon [27.1221 27.18823]
      :start 1959
      :end 10000} 
{     :title "Kajaani lentoasema"
      :id 101725
      :lat [64.2827 64.2828]
      :lon [27.67327 27.67337]
      :start 1959
      :end 10000} 
{     :title "Savonlinna Punkaharju Laukansaari"
      :id 101441
      :lat [61.8003 61.80209]
      :lon [29.31512 29.33027]
      :start 1959
      :end 10000} 
{     :title "Vesanto Sonkari"
      :id 101555
      :lat [62.92173 62.94831]
      :lon [26.39766 26.42475]
      :start 1959
      :end 10000} 
{     :title "Jomala Maarianhaminan lentoasema"
      :id 100907
      :lat [60.11665 60.1248]
      :lon [19.89656 19.90349]
      :start 1959
      :end 10000} 
{     :title "Tohmajärvi Kemie"
      :id 101459
      :lat [62.23534 62.23544]
      :lon [30.34657 30.34667]
      :start 1959
      :end 10000} 
{     :title "Heinola Asemantaus"
      :id 101196
      :lat [61.2 61.2001]
      :lon [26.04945 26.04955]
      :start 1959
      :end 10000} 
{     :title "Kankaanpää Niinisalo Puolustusvoimat"
      :id 101270
      :lat [61.83856 61.83866]
      :lon [22.4634 22.4635]
      :start 1959
      :end 10000} 
{     :title "Joutsa Leivonmäki Savenaho"
      :id 101367
      :lat [61.87937 61.87947]
      :lon [26.09473 26.09483]
      :start 1959
      :end 10000} 
{     :title "Seinäjoki Pelmaa"
      :id 101486
      :lat [62.93699 62.93813]
      :lon [22.48736 22.48883]
      :start 1959
      :end 10000} 
{     :title "Mustasaari Valassaaret"
      :id 101464
      :lat [63.43543 63.43553]
      :lon [21.0645 21.0646]
      :start 1959
      :end 10000} 
{     :title "Kokemäki Rausenkulma"
      :id 101068
      :lat [61.25997 61.27102]
      :lon [22.22747 22.24883]
      :start 1959
      :end 10000} 
{     :title "Rautjärvi Simpele Kangaskoski"
      :id 101253
      :lat [61.42265 61.43371]
      :lon [29.34689 29.39166]
      :start 1959
      :end 10000} 
{     :title "Lappeenranta lentoasema"
      :id 101237
      :lat [61.04416 61.08367]
      :lon [28.14686 28.15104]
      :start 1959
      :end 10000} 
{     :title "Kouvola Anjala"
      :id 101194
      :lat [60.69658 60.71696]
      :lon [26.79683 26.81054]
      :start 1959
      :end 10000} 
{     :title "Hyvinkää Hyvinkäänkylä"
      :id 101130
      :lat [60.59596 60.59606]
      :lon [24.80313 24.80323]
      :start 1959
      :end 10000} 
{     :title "Lohja Porla"
      :id 100974
      :lat [60.24399 60.2502]
      :lon [24.04674 24.04934]
      :start 1959
      :end 10000} 
{     :title "Kauhava lentokenttä"
      :id 101503
      :lat [63.10018 63.1205]
      :lon [23.02966 23.04371]
      :start 1959
      :end 10000} 
{     :title "Vaala Pelso"
      :id 101800
      :lat [64.49185 64.50149]
      :lon [26.42381 26.47027]
      :start 1959
      :end 10000} 
{     :title "Vihti Maasoja"
      :id 100976
      :lat [60.41678 60.41882]
      :lon [24.39674 24.39851]
      :start 1959
      :end 10000} 
{     :title "Mikkeli lentoasema"
      :id 101398
      :lat [61.66813 61.7349]
      :lon [27.1968 27.3049]
      :start 1959
      :end 10000} 
{     :title "Kotka Rankki"
      :id 101030
      :lat [60.3754 60.3755]
      :lon [26.95843 26.95853]
      :start 1959
      :end 10000} 
{     :title "Rovaniemi lentoasema"
      :id 101920
      :lat [66.5588 66.5589]
      :lon [25.83144 25.83154]
      :start 1959
      :end 10000} 
{     :title "Rovaniemi Apukka"
      :id 101933
      :lat [66.57856 66.57941]
      :lon [26.01085 26.01474]
      :start 1959
      :end 10000} 
{     :title "Kuusamo lentoasema"
      :id 101886
      :lat [65.98255 65.99629]
      :lon [29.18061 29.22429]
      :start 1959
      :end 10000} 
{     :title "Juupajoki Hyytiälä"
      :id 101317
      :lat [61.84563 61.85026]
      :lon [24.27989 24.2873]
      :start 1959
      :end 10000} 
{     :title "Siilinjärvi Kuopion lentoasema"
      :id 101570
      :lat [63.00836 63.00846]
      :lon [27.79913 27.79923]
      :start 1959
      :end 10000} 
{     :title "Parainen Utö"
      :id 100908
      :lat [59.78334 59.78428]
      :lon [21.36778 21.3801]
      :start 1959
      :end 10000} 
{     :title "Jyväskylä lentoasema"
      :id 101339
      :lat [62.39753 62.39763]
      :lon [25.67082 25.67092]
      :start 1959
      :end 10000} 
{     :title "Hanko Russarö"
      :id 100932
      :lat [59.77356 59.77366]
      :lon [22.95189 22.95199]
      :start 1959
      :end 10000} 
{     :title "Kaskinen Sälgrund"
      :id 101256
      :lat [62.33344 62.3337]
      :lon [21.17965 21.1904]
      :start 1959
      :end 10000} 
{     :title "Helsinki Kaisaniemi"
      :id 100971
      :lat [60.17518 60.17528]
      :lon [24.94454 24.94464]
      :start 1959
      :end 10000} 
{     :title "Maaninka Halola"
      :id 101572
      :lat [63.14338 63.14348]
      :lon [27.31312 27.31322]
      :start 1959
      :end 10000} 
{     :title "Haapavesi Mustikkamäki"
      :id 101695
      :lat [64.1421 64.15039]
      :lon [25.4245 25.42974]
      :start 1959
      :end 10000} 
{     :title "Vieremä Kaarakkala"
      :id 101726
      :lat [63.83365 63.84118]
      :lon [27.19646 27.22062]
      :start 1959
      :end 10000} 
{     :title "Muonio Alamuonio"
      :id 101969
      :lat [67.96934 67.96944]
      :lon [23.67164 23.67174]
      :start 1959
      :end 10000} 
{     :title "Sodankylä Lapin ilmatieteellinen tutkimuskeskus"
      :id 101932
      :lat [67.36658 67.37974]
      :lon [26.62868 26.646]
      :start 1959
      :end 10000} 
{     :title "Inari Ivalo lentoasema"
      :id 102033
      :lat [68.59916 68.61732]
      :lon [27.41242 27.43392]
      :start 1959
      :end 10000} 
{     :title "Keminmaa Kemi-Tornion lentoasema"
      :id 101840
      :lat [65.78367 65.78377]
      :lon [24.57935 24.57945]
      :start 1959
      :end 10000} 
{     :title "Siikajoki Revonlahti"
      :id 101787
      :lat [64.68363 64.68401]
      :lon [25.08871 25.09631]
      :start 1959
      :end 10000} 
{     :title "Vantaa Helsinki-Vantaan lentoasema"
      :id 100968
      :lat [60.32734 60.32744]
      :lon [24.95706 24.95716]
      :start 1959
      :end 10000} 
{     :title "Säähavaintojen vuorokausiarvot"
      :id 1000565
      :lat [59.78339 69.75637]
      :lon [21.36783 31.05921]
      :start 1959
      :end 10000} 
{     :title "Enonkoski Simanala"
      :id 101446
      :lat [62.0503 62.05568]
      :lon [29.04402 29.0469]
      :start 1961
      :end 10000} 
{     :title "Lahti Laune"
      :id 101152
      :lat [60.96206 60.96694]
      :lon [25.63007 25.63095]
      :start 1961
      :end 10000} 
{     :title "Enontekiö Näkkälä"
      :id 102019
      :lat [68.60298 68.60308]
      :lon [23.57594 23.57604]
      :start 1961
      :end 10000} 
{     :title "Kruunupyy lentoasema"
      :id 101662
      :lat [63.71688 63.71759]
      :lon [23.13869 23.14635]
      :start 1961
      :end 10000} 
{     :title "Juuka Niemelä"
      :id 101609
      :lat [63.21702 63.25045]
      :lon [29.21333 29.24677]
      :start 1962
      :end 10000} 
{     :title "Utsjoki Kevo"
      :id 102035
      :lat [69.75632 69.75642]
      :lon [27.00673 27.00683]
      :start 1962
      :end 10000} 
{     :title "Inkoo Bågaskär"
      :id 100969
      :lat [59.93105 59.93351]
      :lon [24.01344 24.01412]
      :start 1962
      :end 10000} 
{     :title "Hanko Tvärminne"
      :id 100953
      :lat [59.84395 59.84405]
      :lon [23.2484 23.2485]
      :start 1963
      :end 10000} 
{     :title "Hausjärvi Lavinto"
      :id 101139
      :lat [60.80514 60.81691]
      :lon [24.84361 24.84682]
      :start 1963
      :end 10000} 
{     :title "Hämeenlinna Lammi Pappila"
      :id 101154
      :lat [61.05403 61.05413]
      :lon [25.03839 25.03849]
      :start 1963
      :end 10000} 
{     :title "Ylitornio Meltosjärvi"
      :id 101908
      :lat [66.52947 66.53127]
      :lon [24.64955 24.64972]
      :start 1964
      :end 10000} 
{     :title "Heinävesi Palokki"
      :id 101589
      :lat [62.56698 62.57058]
      :lon [28.56338 28.59253]
      :start 1964
      :end 10000} 
{     :title "Savukoski kk"
      :id 101952
      :lat [67.28383 67.28604]
      :lon [28.1627 28.1801]
      :start 1964
      :end 10000} 
{     :title "Jämsä Halli lentokenttä"
      :id 101315
      :lat [61.85018 61.85667]
      :lon [24.78576 24.79669]
      :start 1964
      :end 10000} 
{     :title "Teuva Kauppilankylä"
      :id 101262
      :lat [62.46678 62.49189]
      :lon [21.61301 21.76312]
      :start 1965
      :end 10000} 
{     :title "Sysmä Joutsjärvi"
      :id 101342
      :lat [61.51091 61.51696]
      :lon [25.81133 25.81346]
      :start 1965
      :end 10000} 
{     :title "Lavia Riiho"
      :id 101273
      :lat [61.61454 61.61688]
      :lon [22.54094 22.5466]
      :start 1965
      :end 10000} 
{     :title "Ylöjärvi Metsäkylä"
      :id 101295
      :lat [61.60013 61.6169]
      :lon [23.49655 23.50415]
      :start 1965
      :end 10000} 
{     :title "Ikaalinen Vahojärvi"
      :id 101298
      :lat [61.92119 61.92129]
      :lon [23.09238 23.09248]
      :start 1965
      :end 10000} 
{     :title "Sulkava Halttula"
      :id 101425
      :lat [61.91695 61.92371]
      :lon [28.31344 28.3202]
      :start 1965
      :end 10000} 
{     :title "Köyliö Yttilä"
      :id 101077
      :lat [61.10008 61.11018]
      :lon [22.36323 22.37416]
      :start 1965
      :end 10000} 
{     :title "Viitasaari Kolima Kärnä"
      :id 101545
      :lat [63.16693 63.16758]
      :lon [25.92981 25.93602]
      :start 1965
      :end 10000} 
{     :title "Äänekoski Kalaniemi"
      :id 101541
      :lat [62.86692 62.88368]
      :lon [25.82984 25.86329]
      :start 1965
      :end 10000} 
{     :title "Siikalatva Kestilä"
      :id 101717
      :lat [64.35032 64.3557]
      :lon [26.27967 26.29894]
      :start 1965
      :end 10000} 
{     :title "Kauhajoki kaupunki"
      :id 101284
      :lat [62.41546 62.4169]
      :lon [22.16305 22.18992]
      :start 1965
      :end 10000} 
{     :title "Nokia Tottijärvi"
      :id 101116
      :lat [61.39643 61.39653]
      :lon [23.33632 23.33642]
      :start 1965
      :end 10000} 
{     :title "Vihti Hiiskula"
      :id 101135
      :lat [60.51679 60.52494]
      :lon [24.5134 24.51572]
      :start 1965
      :end 10000} 
{     :title "Pöytyä Yläne"
      :id 101093
      :lat [60.87136 60.87146]
      :lon [22.38795 22.38805]
      :start 1965
      :end 10000} 
{     :title "Lieto Tammentaka"
      :id 101070
      :lat [60.56673 60.57391]
      :lon [22.42996 22.44673]
      :start 1965
      :end 10000} 
{     :title "Jyväskylä Muuratjärvi"
      :id 101352
      :lat [62.15021 62.15503]
      :lon [25.34658 25.42475]
      :start 1965
      :end 10000} 
{     :title "Toholampi Oravala"
      :id 101679
      :lat [63.76357 63.76701]
      :lon [24.28074 24.29641]
      :start 1965
      :end 10000} 
{     :title "Mikkeli Rantakylä"
      :id 101402
      :lat [61.66691 61.67467]
      :lon [27.21341 27.22234]
      :start 1965
      :end 10000} 
{     :title "Uusikaupunki Nervanderinpuisto"
      :id 101049
      :lat [60.80004 60.802]
      :lon [21.42463 21.42999]
      :start 1965
      :end 10000} 
{     :title "Utajärvi Särkijärvi"
      :id 101809
      :lat [64.9277 64.9338]
      :lon [27.18862 27.19641]
      :start 1965
      :end 10000} 
{     :title "Kaustinen Tastula"
      :id 101665
      :lat [63.59356 63.59366]
      :lon [23.71657 23.71667]
      :start 1965
      :end 10000} 
{     :title "Joensuu Pyhäselkä"
      :id 101610
      :lat [62.51701 62.51716]
      :lon [29.79679 29.80783]
      :start 1965
      :end 10000} 
{     :title "Joensuu Huhtilampi"
      :id 101460
      :lat [62.41702 62.43656]
      :lon [30.39683 30.40832]
      :start 1965
      :end 10000} 
{     :title "Outokumpu Viuruniemi"
      :id 101590
      :lat [62.61699 62.61736]
      :lon [28.94229 28.94683]
      :start 1965
      :end 10000} 
{     :title "Kalajoki Metsäkylä"
      :id 101685
      :lat [64.27359 64.28369]
      :lon [24.19622 24.20743]
      :start 1965
      :end 10000} 
{     :title "Kärsämäki Venetpalo"
      :id 101700
      :lat [63.88362 63.90039]
      :lon [25.76304 25.7848]
      :start 1965
      :end 10000} 
{     :title "Kiuruvesi Korpijoki"
      :id 101712
      :lat [63.72863 63.73373]
      :lon [26.34643 26.36986]
      :start 1965
      :end 10000} 
{     :title "Inari Raja-Jooseppi Akujärvi"
      :id 102008
      :lat [68.47062 68.47072]
      :lon [28.31614 28.31624]
      :start 1965
      :end 10000} 
{     :title "Pello Konttajärvi"
      :id 101909
      :lat [66.83372 66.84132]
      :lon [24.3625 24.39594]
      :start 1965
      :end 10000} 
{     :title "Salla Kelloselkä"
      :id 101956
      :lat [66.93383 66.94589]
      :lon [28.96281 28.97596]
      :start 1965
      :end 10000} 
{     :title "Huittinen Sallila"
      :id 101075
      :lat [61.02331 61.02358]
      :lon [22.69858 22.6987]
      :start 1965
      :end 10000} 
{     :title "Alavus Sulkavankylä"
      :id 101305
      :lat [62.44928 62.45027]
      :lon [23.54645 23.55497]
      :start 1966
      :end 10000} 
{     :title "Ikaalinen Vehuvarpee"
      :id 101277
      :lat [61.73345 61.73911]
      :lon [22.81317 22.82993]
      :start 1966
      :end 10000} 
{     :title "Karvia Alkkia"
      :id 101272
      :lat [62.1832 62.19066]
      :lon [22.70373 22.79977]
      :start 1966
      :end 10000} 
{     :title "Laitila Haukka"
      :id 101050
      :lat [60.83311 60.83321]
      :lon [21.75685 21.75695]
      :start 1966
      :end 10000} 
{     :title "Hämeenlinna Pirttikoski"
      :id 101143
      :lat [61.00651 61.08356]
      :lon [23.92004 24.11342]
      :start 1966
      :end 10000} 
{     :title "Nurmes Mujejärvi"
      :id 101763
      :lat [63.78371 63.82492]
      :lon [29.4466 29.46338]
      :start 1966
      :end 10000} 
{     :title "Kuusamo Kiutaköngäs"
      :id 101887
      :lat [66.36994 66.37004]
      :lon [29.31188 29.31198]
      :start 1966
      :end 10000} 
{     :title "Merikarvia Tuorila Alakylä"
      :id 101257
      :lat [61.84842 61.84852]
      :lon [21.65087 21.65097]
      :start 1967
      :end 10000} 
{     :title "Halsua Kanala Purola"
      :id 101528
      :lat [63.44559 63.45033]
      :lon [24.44417 24.44646]
      :start 1967
      :end 10000} 
{     :title "Sotkamo Saviaho"
      :id 101745
      :lat [63.95036 63.95518]
      :lon [28.42596 28.42995]
      :start 1967
      :end 10000} 
{     :title "Tyrnävä Temmes"
      :id 101790
      :lat [64.65032 64.65848]
      :lon [25.59625 25.61718]
      :start 1967
      :end 10000} 
{     :title "Kuusamo Toranginaho"
      :id 101891
      :lat [65.95046 65.95334]
      :lon [29.12963 29.16307]
      :start 1967
      :end 10000} 
{     :title "Joutsa Pärnämäki"
      :id 101390
      :lat [61.76605 61.76699]
      :lon [26.39225 26.39679]
      :start 1967
      :end 10000} 
{     :title "Utsjoki Nuorgam"
      :id 102036
      :lat [70.08198 70.08888]
      :lon [27.89135 27.9406]
      :start 1968
      :end 10000} 
{     :title "Luhanka Tammijärvi"
      :id 101348
      :lat [61.83532 61.83542]
      :lon [25.85365 25.85375]
      :start 1968
      :end 10000} 
{     :title "Savonlinna Laukansaari"
      :id 101423
      :lat [61.79598 61.80039]
      :lon [28.83015 28.84617]
      :start 1968
      :end 10000} 
{     :title "Isojoki Kärjenkoski"
      :id 101258
      :lat [62.13283 62.13293]
      :lon [21.67357 21.67367]
      :start 1968
      :end 10000} 
{     :title "Kokkola Korplax"
      :id 101667
      :lat [63.85021 63.88365]
      :lon [23.19623 23.23466]
      :start 1968
      :end 10000} 
{     :title "Posio Raistakka"
      :id 101881
      :lat [65.97877 65.98387]
      :lon [28.1629 28.17105]
      :start 1968
      :end 10000} 
{     :title "Ristijärvi Hiisijärvi"
      :id 101748
      :lat [64.36621 64.36715]
      :lon [28.5798 28.60769]
      :start 1968
      :end 10000} 
{     :title "Mustasaari Riimala"
      :id 101474
      :lat [62.96681 62.98357]
      :lon [21.74628 21.77971]
      :start 1969
      :end 10000} 
{     :title "Kalajoki Pitkäsenkylä"
      :id 101683
      :lat [64.23108 64.23368]
      :lon [24.01289 24.01576]
      :start 1969
      :end 10000} 
{     :title "Lohja Nummi-Pusula Leppäkorpi"
      :id 100963
      :lat [60.49121 60.49131]
      :lon [23.76612 23.76622]
      :start 1969
      :end 10000} 
{     :title "Savukoski Ruuvaoja"
      :id 102007
      :lat [67.65053 67.65624]
      :lon [28.70901 28.71278]
      :start 1969
      :end 10000} 
{     :title "Inari Angeli"
      :id 102024
      :lat [68.90959 68.90969]
      :lon [25.66231 25.66241]
      :start 1970
      :end 10000} 
{     :title "Suomussalmi Haapovaara"
      :id 101837
      :lat [65.26571 65.2672]
      :lon [28.99638 29.01259]
      :start 1970
      :end 10000} 
{     :title "Taivalkoski Inkee"
      :id 101882
      :lat [65.73377 65.7346]
      :lon [28.54629 28.56086]
      :start 1970
      :end 10000} 
{     :title "Suomussalmi Näljänkä"
      :id 101822
      :lat [65.21708 65.23969]
      :lon [28.41302 28.44839]
      :start 1970
      :end 10000} 
{     :title "Mikkeli Pitkähiekka"
      :id 101410
      :lat [62.01692 62.03424]
      :lon [27.19392 27.1968]
      :start 1970
      :end 10000} 
{     :title "Iitti Kausala"
      :id 101210
      :lat [60.88765 60.93361]
      :lon [26.26344 26.35349]
      :start 1970
      :end 10000} 
{     :title "Oripää Teinikivi"
      :id 101081
      :lat [60.90008 60.90435]
      :lon [22.6966 22.7117]
      :start 1970
      :end 10000} 
{     :title "Pelkosenniemi kirkonkylä"
      :id 101947
      :lat [67.1002 67.10058]
      :lon [27.49601 27.51]
      :start 1970
      :end 10000} 
{     :title "Jalasjärvi Hirvijärvi"
      :id 101285
      :lat [62.47293 62.47303]
      :lon [22.91002 22.91012]
      :start 1970
      :end 10000} 
{     :title "Valtimo kk"
      :id 101743
      :lat [63.66703 63.66735]
      :lon [28.82922 28.83001]
      :start 1970
      :end 10000} 
{     :title "Asikkala Urajärvi"
      :id 101168
      :lat [61.13351 61.13722]
      :lon [25.79256 25.79683]
      :start 1970
      :end 10000} 
{     :title "Mäntsälä Hirvihaara"
      :id 101166
      :lat [60.62486 60.63357]
      :lon [25.22432 25.31353]
      :start 1970
      :end 10000} 
{     :title "Viitasaari Haapaniemi"
      :id 101537
      :lat [63.0767 63.08254]
      :lon [25.8482 25.85867]
      :start 1970
      :end 10000} 
{     :title "Pudasjärvi Sarakylä"
      :id 101877
      :lat [65.78985 65.80051]
      :lon [27.32952 27.33297]
      :start 1970
      :end 10000} 
{     :title "Rautavaara Ala-Luosta"
      :id 101599
      :lat [63.267 63.27154]
      :lon [28.46328 28.47004]
      :start 1970
      :end 10000} 
{     :title "Kouvola Voikoski"
      :id 101211
      :lat [61.25132 61.25142]
      :lon [26.77899 26.77909]
      :start 1970
      :end 10000} 
{     :title "Lieksa Koli"
      :id 101616
      :lat [63.10877 63.10887]
      :lon [29.75841 29.75851]
      :start 1970
      :end 10000} 
{     :title "Lieksa Lampela"
      :id 101636
      :lat [63.30532 63.32113]
      :lon [30.02397 30.04583]
      :start 1970
      :end 10000} 
{     :title "Ilomantsi Naarva"
      :id 101641
      :lat [63.03244 63.03254]
      :lon [31.05916 31.05926]
      :start 1970
      :end 10000} 
{     :title "Kajaani Saaresmäki"
      :id 101721
      :lat [64.05116 64.0671]
      :lon [26.92531 26.92984]
      :start 1970
      :end 10000} 
{     :title "Pudasjärvi Jaurakkajärvi"
      :id 101812
      :lat [65.16067 65.16716]
      :lon [27.61297 27.64669]
      :start 1970
      :end 10000} 
{     :title "Kolari Kattilamaa"
      :id 101913
      :lat [67.3843 67.40051]
      :lon [24.01183 24.17916]
      :start 1970
      :end 10000} 
{     :title "Nurmijärvi geofysiikan observatorio"
      :id 101149
      :lat [60.50873 60.51689]
      :lon [24.64674 24.65378]
      :start 1970
      :end 10000} 
{     :title "Lapinlahti Lamminkäyrä"
      :id 101577
      :lat [63.37753 63.38374]
      :lon [27.36987 27.37996]
      :start 1970
      :end 10000} 
{     :title "Pello kk Museotie"
      :id 101914
      :lat [66.7667 66.77283]
      :lon [23.96298 23.9688]
      :start 1970
      :end 10000} 
{     :title "Rääkkylä kk"
      :id 101450
      :lat [62.31132 62.31142]
      :lon [29.6293 29.6294]
      :start 1971
      :end 10000} 
{     :title "Jomala Jomalaby"
      :id 100917
      :lat [60.17831 60.18341]
      :lon [19.97989 19.98638]
      :start 1971
      :end 10000} 
{     :title "Kittilä Pokka"
      :id 101994
      :lat [68.16967 68.16977]
      :lon [25.78301 25.78311]
      :start 1971
      :end 10000} 
{     :title "Salla Värriötunturi"
      :id 102012
      :lat [67.74806 67.74816]
      :lon [29.61107 29.61117]
      :start 1974
      :end 10000} 
{     :title "Savonlinna lentoasema"
      :id 101430
      :lat [61.9464 61.95039]
      :lon [28.93153 28.94691]
      :start 1974
      :end 10000} 
{     :title "Rautavaara Ylä-Luosta"
      :id 101603
      :lat [63.37801 63.38377]
      :lon [28.66161 28.66338]
      :start 1976
      :end 10000} 
{     :title "Inari Saariselkä matkailukeskus"
      :id 102005
      :lat [68.41501 68.41833]
      :lon [27.41097 27.41331]
      :start 1976
      :end 10000} 
{     :title "Virolahti Koivuniemi"
      :id 101231
      :lat [60.51688 60.53364]
      :lon [27.67268 27.68033]
      :start 1977
      :end 10000} 
{     :title "Suonenjoki Iisvesi"
      :id 101578
      :lat [62.66444 62.66704]
      :lon [27.02994 27.04699]
      :start 1978
      :end 10000} 
{     :title "Ristijärvi Mustavaara"
      :id 101753
      :lat [64.45039 64.46966]
      :lon [28.61314 28.61823]
      :start 1978
      :end 10000} 
{     :title "Enontekiö Kilpisjärvi kyläkeskus"
      :id 102016
      :lat [69.04942 69.04952]
      :lon [20.79112 20.79122]
      :start 1978
      :end 10000} 
{     :title "Pirkkala Tampere-Pirkkalan lentoasema"
      :id 101118
      :lat [61.42069 61.42079]
      :lon [23.61991 23.62001]
      :start 1979
      :end 10000} 
{     :title "Kurikka Pyörni"
      :id 101478
      :lat [62.73346 62.73384]
      :lon [21.95939 21.97976]
      :start 1980
      :end 10000} 
{     :title "Suomussalmi Pesiö"
      :id 101826
      :lat [64.93122 64.93132]
      :lon [28.74668 28.74678]
      :start 1981
      :end 10000} 
{     :title "Kemi I majakka"
      :id 101783
      :lat [65.38364 65.38541]
      :lon [24.09605 24.09615]
      :start 1981
      :end 10000} 
{     :title "Porvoo Kalbådagrund"
      :id 101022
      :lat [59.98513 59.98523]
      :lon [25.5985 25.5986]
      :start 1981
      :end 10000} 
{     :title "Kalajoki Ulkokalla"
      :id 101673
      :lat [64.33099 64.33367]
      :lon [23.44617 23.44652]
      :start 1981
      :end 10000} 
{     :title "Hammarland Märket"
      :id 100919
      :lat [60.29996 60.30103]
      :lon [19.12984 19.13147]
      :start 1981
      :end 10000} 
{     :title "Ilomantsi Pötsönvaara"
      :id 101649
      :lat [63.14228 63.14238]
      :lon [31.04419 31.04429]
      :start 1981
      :end 10000} 
{     :title "Enontekiö Hetta"
      :id 101974
      :lat [68.38601 68.40055]
      :lon [23.58773 23.72894]
      :start 1983
      :end 10000} 
{     :title "Kemi Ajos"
      :id 101846
      :lat [65.67287 65.73377]
      :lon [24.51269 24.5153]
      :start 1984
      :end 10000} 
{     :title "Hailuoto Marjaniemi"
      :id 101784
      :lat [65.03364 65.03999]
      :lon [24.56144 24.5629]
      :start 1984
      :end 10000} 
{     :title "Loviisa Orrengrund"
      :id 101039
      :lat [60.27483 60.27493]
      :lon [26.44452 26.44462]
      :start 1984
      :end 10000} 
{     :title "Porvoo Emäsalo"
      :id 101023
      :lat [60.20375 60.21691]
      :lon [25.62543 25.63025]
      :start 1984
      :end 10000} 
{     :title "Kökar Bogskär"
      :id 100921
      :lat [59.50551 59.50561]
      :lon [20.35551 20.35561]
      :start 1984
      :end 10000} 
{     :title "Kustavi Isokari"
      :id 101059
      :lat [60.7167 60.72235]
      :lon [21.01322 21.02679]
      :start 1984
      :end 10000} 
{     :title "Kotka Haapasaari"
      :id 101042
      :lat [60.28657 60.28667]
      :lon [27.18522 27.18532]
      :start 1986
      :end 10000} 
{     :title "Pielavesi Venetmäki"
      :id 101569
      :lat [63.31502 63.31707]
      :lon [26.97902 26.97995]
      :start 1987
      :end 10000} 
{     :title "Hanko Tulliniemi"
      :id 100946
      :lat [59.80856 59.80866]
      :lon [22.91578 22.91588]
      :start 1990
      :end 10000} 
{     :title "Multia Pirttiperä"
      :id 101363
      :lat [62.41041 62.41056]
      :lon [25.04991 25.05061]
      :start 1991
      :end 10000} 
{     :title "Kemiönsaari Vänö"
      :id 100945
      :lat [59.8667 59.86957]
      :lon [22.19336 22.19679]
      :start 1991
      :end 10000} 
{     :title "Raasepori Jussarö"
      :id 100965
      :lat [59.82051 59.82061]
      :lon [23.57634 23.57644]
      :start 1991
      :end 10000} 
{     :title "Puumala kirkonkylä"
      :id 101435
      :lat [61.53609 61.53619]
      :lon [28.18875 28.18885]
      :start 1991
      :end 10000} 
{     :title "Raahe Lapaluoto"
      :id 101785
      :lat [64.65 64.68]
      :lon [24.41 24.46]
      :start 1991
      :end 10000} 
{     :title "Inari Nellim"
      :id 102052
      :lat [68.84915 68.84925]
      :lon [28.29905 28.29915]
      :start 1991
      :end 10000} 
{     :title "Kuopio Ritoniemi"
      :id 101580
      :lat [62.79888 62.8004]
      :lon [27.90492 27.91341]
      :start 1991
      :end 10000} 
{     :title "Rauma Kylmäpihlaja"
      :id 101061
      :lat [61.14472 61.15015]
      :lon [21.29651 21.30278]
      :start 1991
      :end 10000} 
{     :title "Enontekiö Kilpisjärvi Saana"
      :id 102017
      :lat [69.04269 69.04279]
      :lon [20.85128 20.85138]
      :start 1991
      :end 10000} 
{     :title "Inari Väylä"
      :id 102042
      :lat [69.07214 69.07224]
      :lon [27.49245 27.49255]
      :start 1991
      :end 10000} 
{     :title "Luhanka Judinsalo"
      :id 101362
      :lat [61.70019 61.70448]
      :lon [25.49665 25.50525]
      :start 1991
      :end 10000} 
{     :title "Asikkala Pulkkilanharju"
      :id 101185
      :lat [61.26506 61.26694]
      :lon [25.52014 25.53013]
      :start 1992
      :end 10000} 
{     :title "Turku Rajakari"
      :id 100947
      :lat [60.37783 60.38347]
      :lon [22.0133 22.09645]
      :start 1992
      :end 10000} 
{     :title "Korsnäs Bredskäret"
      :id 101479
      :lat [62.93428 62.93438]
      :lon [21.1852 21.1853]
      :start 1992
      :end 10000} 
{     :title "Enontekiö Karesuvanto"
      :id 101968
      :lat [68.4504 68.4505]
      :lon [22.49539 22.49549]
      :start 1992
      :end 10000} 
{     :title "Sotkamo Kuolaniemi"
      :id 101756
      :lat [64.11148 64.11714]
      :lon [28.32982 28.33881]
      :start 1992
      :end 10000} 
{     :title "Kirkkonummi Mäkiluoto"
      :id 100997
      :lat [59.91676 59.92019]
      :lon [24.34679 24.34939]
      :start 1992
      :end 10000} 
{     :title "Virrat Äijänneva"
      :id 101310
      :lat [62.32778 62.32788]
      :lon [23.54223 23.54233]
      :start 1992
      :end 10000} 
{     :title "Kauhajoki Kuja-Kokko"
      :id 101289
      :lat [62.4134 62.4135]
      :lon [22.18367 22.18377]
      :start 1992
      :end 10000} 
{     :title "Juva Partala"
      :id 101418
      :lat [61.89225 61.89235]
      :lon [27.88523 27.88533]
      :start 1992
      :end 10000} 
{     :title "Toholampi Laitala"
      :id 101689
      :lat [63.78357 63.82145]
      :lon [24.16296 24.16361]
      :start 1992
      :end 10000} 
{     :title "Pyhäjärvi Ojakylä"
      :id 101705
      :lat [63.73595 63.75038]
      :lon [25.70564 25.71316]
      :start 1992
      :end 10000} 
{     :title "Lappeenranta Konnunsuo"
      :id 101246
      :lat [61.03874 61.03884]
      :lon [28.5639 28.564]
      :start 1992
      :end 10000} 
{     :title "Parikkala Koitsanlahti"
      :id 101254
      :lat [61.44462 61.44472]
      :lon [29.46103 29.46113]
      :start 1992
      :end 10000} 
{     :title "Parainen Fagerholm"
      :id 100924
      :lat [60.11158 60.11168]
      :lon [21.69934 21.69944]
      :start 1992
      :end 10000} 
{     :title "Tampere Siilinkari"
      :id 101311
      :lat [61.51752 61.51762]
      :lon [23.75364 23.75374]
      :start 1992
      :end 10000} 
{     :title "Kuusamo Rukatunturi"
      :id 101897
      :lat [66.16564 66.16724]
      :lon [29.14627 29.15156]
      :start 1993
      :end 10000} 
{     :title "Puolanka Kotila"
      :id 101830
      :lat [64.66594 64.66715]
      :lon [28.02918 28.0465]
      :start 1994
      :end 10000} 
{     :title "Lappeenranta Lepola"
      :id 101247
      :lat [61.05024 61.05759]
      :lon [28.19687 28.20878]
      :start 1995
      :end 10000} 
{     :title "Pietarsaari Kallan"
      :id 101660
      :lat [63.75019 63.75151]
      :lon [22.52285 22.52964]
      :start 1995
      :end 10000} 
{     :title "Pelkosenniemi Pyhätunturi"
      :id 101958
      :lat [67.02199 67.02209]
      :lon [27.21835 27.21845]
      :start 1995
      :end 10000} 
{     :title "Kittilä Levitunturi"
      :id 101981
      :lat [67.78467 67.78477]
      :lon [24.85314 24.85324]
      :start 1995
      :end 10000} 
{     :title "Inari Saariselkä Kaunispää"
      :id 102006
      :lat [68.43263 68.43273]
      :lon [27.44466 27.44476]
      :start 1995
      :end 10000} 
{     :title "Alajärvi Möksy"
      :id 101533
      :lat [63.08354 63.08906]
      :lon [24.26093 24.26317]
      :start 1996
      :end 10000} 
{     :title "Kokkola Tankar"
      :id 101661
      :lat [63.95021 63.95092]
      :lon [22.84434 22.8463]
      :start 1996
      :end 10000} 
{     :title "Pori Tahkoluoto"
      :id 101267
      :lat [61.63035 61.63045]
      :lon [21.37587 21.37597]
      :start 1996
      :end 10000} 
{     :title "Muonio Laukukero"
      :id 101982
      :lat [68.06279 68.06289]
      :lon [24.0333 24.0334]
      :start 1996
      :end 10000} 
{     :title "Muonio Sammaltunturi"
      :id 101983
      :lat [67.96711 67.97337]
      :lon [24.11229 24.11594]
      :start 1996
      :end 10000} 
{     :title "Oulu Vihreäsaari"
      :id 101794
      :lat [65.00616 65.00626]
      :lon [25.39313 25.39323]
      :start 1996
      :end 10000} 
{     :title "Pyhäjärvi Hiidenniemi"
      :id 101706
      :lat [63.61 63.61]
      :lon [25.47 25.47]
      :start 1997
      :end 10000} 
{     :title "Tampere Härmälä"
      :id 101124
      :lat [61.46567 61.46577]
      :lon [23.74649 23.74659]
      :start 1997
      :end 10000} 
{     :title "Liperi Tuiskavanluoto"
      :id 101628
      :lat [62.54617 62.54627]
      :lon [29.66845 29.66855]
      :start 1997
      :end 10000} 
{     :title "Maalahti Strömmingsbådan"
      :id 101481
      :lat [62.97844 62.97854]
      :lon [20.73983 20.73993]
      :start 1997
      :end 10000} 
{     :title "Rantasalmi Rukkasluoto"
      :id 101436
      :lat [62.06307 62.06317]
      :lon [28.56594 28.56604]
      :start 1997
      :end 10000} 
{     :title "Kristiinankaupunki Majakka"
      :id 101268
      :lat [62.20343 62.20353]
      :lon [21.16966 21.16976]
      :start 1997
      :end 10000} 
{     :title "Kuhmo Raiskio"
      :id 101771
      :lat [64.05567 64.05577]
      :lon [29.3138 29.3139]
      :start 1997
      :end 10000} 
{     :title "Raahe Nahkiainen"
      :id 101775
      :lat [64.61194 64.61204]
      :lon [23.89617 23.89627]
      :start 1997
      :end 10000} 
{     :title "Rovaniemi rautatieasema"
      :id 101928
      :lat [66.4984 66.4985]
      :lon [25.70821 25.70831]
      :start 1997
      :end 10000} 
{     :title "Kuhmo Kalliojoki"
      :id 101773
      :lat [64.29781 64.29791]
      :lon [30.16647 30.16657]
      :start 1997
      :end 10000} 
{     :title "Ruokolahti Kotaniemi Siitonen"
      :id 101248
      :lat [61.36693 61.36847]
      :lon [28.66353 28.68024]
      :start 1997
      :end 10000} 
{     :title "Kankaanpää Niinisalo lentokenttä"
      :id 101291
      :lat [61.83844 61.84188]
      :lon [22.46314 22.46379]
      :start 1998
      :end 10000} 
{     :title "Kuusamo Teeriranta"
      :id 101898
      :lat [65.52007 65.52017]
      :lon [29.52072 29.52082]
      :start 1998
      :end 10000} 
{     :title "Salla kk Myllytie"
      :id 101959
      :lat [66.83398 66.83408]
      :lon [28.67422 28.67432]
      :start 1999
      :end 10000} 
{     :title "Pudasjärvi lentokenttä"
      :id 101805
      :lat [65.40009 65.40019]
      :lon [26.96306 26.96316]
      :start 1999
      :end 10000} 
{     :title "Ilomantsi Mekrijärvi"
      :id 101651
      :lat [62.76961 62.76971]
      :lon [30.97528 30.97538]
      :start 1999
      :end 10000} 
{     :title "Salla Naruska"
      :id 101966
      :lat [67.16221 67.16231]
      :lon [29.17761 29.17771]
      :start 1999
      :end 10000} 
{     :title "Kittilä lentoasema"
      :id 101986
      :lat [67.68377 67.69607]
      :lon [24.84572 24.85821]
      :start 1999
      :end 10000} 
{     :title "Joroinen Varkauden lentoasema"
      :id 101420
      :lat [62.17389 62.17399]
      :lon [27.86033 27.86043]
      :start 1999
      :end 10000} 
{     :title "Ylivieska lentokenttä"
      :id 101690
      :lat [64.03666 64.05023]
      :lon [24.71879 24.72417]
      :start 2000
      :end 10000} 
{     :title "Ylivieska Vähäkangas"
      :id 101691
      :lat [64.06666 64.06676]
      :lon [24.67351 24.67361]
      :start 2000
      :end 10000} 
{     :title "Kajaani Paltaniemi"
      :id 101742
      :lat [64.29149 64.29159]
      :lon [27.63676 27.63686]
      :start 2000
      :end 10000} 
{     :title "Kumlinge kirkonkylä"
      :id 100928
      :lat [60.25807 60.25817]
      :lon [20.74715 20.74725]
      :start 2000
      :end 10000} 
{     :title "Hämeenlinna Katinen"
      :id 101150
      :lat [60.99931 60.99941]
      :lon [24.49139 24.49149]
      :start 2001
      :end 10000} 
{     :title "Salo Kiikala lentokenttä"
      :id 100967
      :lat [60.46409 60.46419]
      :lon [23.64976 23.64986]
      :start 2002
      :end 10000} 
{     :title "Taivalkoski kk Kauppatie"
      :id 101885
      :lat [65.57432 65.57442]
      :lon [28.24436 28.24446]
      :start 2002
      :end 10000} 
{     :title "Kittilä Kenttärova"
      :id 101987
      :lat [67.98723 67.98733]
      :lon [24.24283 24.24293]
      :start 2002
      :end 10000} 
{     :title "Tornio Aapajärvi"
      :id 101850
      :lat [66.06956 66.06966]
      :lon [24.14416 24.14426]
      :start 2002
      :end 10000} 
{     :title "Turku Artukainen"
      :id 100949
      :lat [60.45449 60.45459]
      :lon [22.1783 22.1784]
      :start 2003
      :end 10000} 
{     :title "Inari Rajajooseppi"
      :id 102009
      :lat [68.47795 68.47805]
      :lon [28.30118 28.30128]
      :start 2003
      :end 10000} 
{     :title "Helsinki Helsingin majakka"
      :id 101003
      :lat [59.94844 59.94854]
      :lon [24.9268 24.9269]
      :start 2003
      :end 10000} 
{     :title "Inari kirkonkylä"
      :id 102046
      :lat [68.90582 68.90592]
      :lon [27.01397 27.01407]
      :start 2003
      :end 10000} 
{     :title "Kittilä Alakylä"
      :id 101918
      :lat [67.26245 67.26255]
      :lon [24.96584 24.96594]
      :start 2004
      :end 10000} 
{     :title "Espoo Sepänkylä"
      :id 101005
      :lat [60.20769 60.20779]
      :lon [24.74117 24.74127]
      :start 2005
      :end 10000} 
{     :title "Kuopio Savilahti"
      :id 101586
      :lat [62.89255 62.89265]
      :lon [27.6334 27.6335]
      :start 2005
      :end 10000} 
{     :title "Hämeenlinna Lammi Evo"
      :id 101189
      :lat [61.21655 61.21665]
      :lon [25.13278 25.13288]
      :start 2005
      :end 10000} 
{     :title "Helsinki Kumpula"
      :id 101004
      :lat [60.20277 60.20312]
      :lon [24.96104 24.96136]
      :start 2006
      :end 10000} 
{     :title "Kemijärvi lentokenttä"
      :id 101950
      :lat [66.71551 66.71561]
      :lon [27.15907 27.15917]
      :start 2006
      :end 10000} 
{     :title "Porvoo Harabacka"
      :id 101028
      :lat [60.39153 60.39163]
      :lon [25.60818 25.60828]
      :start 2006
      :end 10000} 
{     :title "Kotka Kirkonmaa"
      :id 101043
      :lat [60.38518 60.38528]
      :lon [27.04855 27.04865]
      :start 2006
      :end 10000} 
{     :title "Hattula Lepaa"
      :id 101151
      :lat [61.11473 61.11483]
      :lon [24.3244 24.3245]
      :start 2006
      :end 10000} 
{     :title "Varkaus Kosulanniemi"
      :id 101421
      :lat [62.32223 62.32233]
      :lon [27.90782 27.90792]
      :start 2008
      :end 10000} 
{     :title "Kokkola Hollihaka"
      :id 101675
      :lat [63.84439 63.84449]
      :lon [23.12428 23.12438]
      :start 2008
      :end 10000} 
{     :title "Oulu Oulunsalo Pellonpää"
      :id 101799
      :lat [64.93783 64.93793]
      :lon [25.37176 25.37186]
      :start 2008
      :end 10000} 
{     :title "Tornio Torppi"
      :id 101851
      :lat [65.84701 65.84711]
      :lon [24.17348 24.17358]
      :start 2008
      :end 10000} 
{     :title "Inari Kaamanen"
      :id 102047
      :lat [69.14084 69.14094]
      :lon [27.26562 27.26572]
      :start 2008
      :end 10000} 
{     :title "Ranua lentokenttä"
      :id 101873
      :lat [65.97679 65.97689]
      :lon [26.36749 26.36759]
      :start 2008
      :end 10000} 
{     :title "Multia Karhila"
      :id 101536
      :lat [62.51039 62.51049]
      :lon [24.80759 24.80769]
      :start 2008
      :end 10000} 
{     :title "Jämsä Halli Lentoasemantie"
      :id 101338
      :lat [61.85962 61.85972]
      :lon [24.81492 24.81502]
      :start 2008
      :end 10000} 
{     :title "Kouvola Utti Lentoportintie"
      :id 101219
      :lat [60.89047 60.89057]
      :lon [26.94125 26.94135]
      :start 2008
      :end 10000} 
{     :title "Inari Angeli Lintupuoliselkä"
      :id 102026
      :lat [68.90291 68.90301]
      :lon [25.73641 25.73651]
      :start 2008
      :end 10000} 
{     :title "Pori rautatieasema"
      :id 101064
      :lat [61.47888 61.47898]
      :lon [21.78315 21.78325]
      :start 2008
      :end 10000} 
{     :title "Kauhava kk Uunimaantie"
      :id 101519
      :lat [63.12018 63.12028]
      :lon [23.04355 23.04365]
      :start 2008
      :end 10000} 
{     :title "Joensuu Linnunlahti"
      :id 101632
      :lat [62.6015 62.6016]
      :lon [29.72375 29.72385]
      :start 2008
      :end 10000} 
{     :title "Inari Kirakkajärvi"
      :id 102055
      :lat [69.58245 69.58255]
      :lon [28.89404 28.89414]
      :start 2009
      :end 10000} 
{     :title "Kemiönsaari Kemiö kk"
      :id 100951
      :lat [60.17145 60.17155]
      :lon [22.75752 22.75762]
      :start 2009
      :end 10000} 
{     :title "Puolanka Paljakka"
      :id 101831
      :lat [64.66399 64.66409]
      :lon [28.05668 28.05678]
      :start 2009
      :end 10000} 
{     :title "Helsinki Rautatientori"
      :id 101007
      :lat [60.17164 60.17174]
      :lon [24.94455 24.94465]
      :start 2009
      :end 10000} 
{     :title "Kittilä kk"
      :id 101990
      :lat [67.65205 67.65215]
      :lon [24.90157 24.90167]
      :start 2009
      :end 10000} 
{     :title "Lappeenranta Hiekkapakka"
      :id 101252
      :lat [61.19803 61.19813]
      :lon [28.47269 28.47279]
      :start 2009
      :end 10000} 
{     :title "Kokemäki Tulkkila"
      :id 101103
      :lat [61.25289 61.25299]
      :lon [22.34608 22.34618]
      :start 2010
      :end 10000} 
{     :title "Vaasa Klemettilä"
      :id 101485
      :lat [63.0987 63.0988]
      :lon [21.63947 21.63957]
      :start 2010
      :end 10000} 
{     :title "Utsjoki Kevo Kevojärvi"
      :id 126737
      :lat [69.75695 69.75705]
      :lon [27.01195 27.01205]
      :start 2010
      :end 10000} 
{     :title "Kittilä Matorova"
      :id 101985
      :lat [67.99993 68.00003]
      :lon [24.23998 24.24008]
      :start 2010
      :end 10000} 
{     :title "Kajaani Petäisenniska"
      :id 126736
      :lat [64.21662 64.21672]
      :lon [27.75495 27.75505]
      :start 2010
      :end 10000} 
{     :title "Liperi lentoasema vertailumittaus"
      :id 126760
      :lat [62.65939 62.65949]
      :lon [29.61439 29.61449]
      :start 2010
      :end 10000} 
{     :title "Inari Seitalaassa"
      :id 129963
      :lat [69.04827 69.04837]
      :lon [27.75677 27.75687]
      :start 2011
      :end 10000} 
{     :title "Somero Salkola"
      :id 101128
      :lat [60.6465 60.6466]
      :lon [23.80584 23.80594]
      :start 2011
      :end 10000} 
{     :title "Vaala Pelso Puutteenperä"
      :id 134522
      :lat [64.51128 64.51138]
      :lon [26.46051 26.46061]
      :start 2011
      :end 10000} 
{     :title "Puumala kk Urheilukenttä"
      :id 150168
      :lat [61.52237 61.52247]
      :lon [28.18486 28.18496]
      :start 2012
      :end 10000} 
{     :title "Helsinki Harmaja"
      :id 100996
      :lat [60.10011 60.10493]
      :lon [24.97541 24.98023]
      :start 2013
      :end 10000} 
{     :title "Tampere keskusta Satakunnankatu"
      :id 151049
      :lat [61.50118 61.50128]
      :lon [23.76463 23.76473]
      :start 2013
      :end 10000}
   ]
  )

(def name-to-id
  (apply hash-map (flatten (map (juxt :title :id) metadata))))
