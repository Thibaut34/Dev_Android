package com.example.randoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;



public class RandoMap extends AppCompatActivity {

    private static final String CHANNEL_ID = "test";
    MapView mapView;
    String rando1 ="{\"type\":\"FeatureCollection\", \"features\":[\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.290437,48.010431,70]},\"properties\":{\"name\":\"Place de la Fontaine\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.292305,48.011813,70]},\"properties\":{\"name\":\"Débouché chemin\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.299419,48.009811,73]},\"properties\":{\"name\":\"Route\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.313268,48.003036,53]},\"properties\":{\"name\":\"Bifurcation\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.31477,48.007428,54]},\"properties\":{\"name\":\"D37\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.316402,48.017629,68]},\"properties\":{\"name\":\"Petit bois\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.310955,48.025067,96]},\"properties\":{\"name\":\"D95\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.298068,48.025133,91]},\"properties\":{\"name\":\"Bifurcation (angle du champ)\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.294754,48.019339,71]},\"properties\":{\"name\":\"Chemin agricole\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.294557,48.015776,76]},\"properties\":{\"name\":\"Lotissement\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.291378,48.012082,71]},\"properties\":{\"name\":\"Cimetière\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\",\"coordinates\":[-1.290438,48.01043,70]},\"properties\":{\"name\":\"Place de la Fontaine\"}},\n" +
            "{\"type\":\"Feature\",\"geometry\":{\"type\":\"MultiLineString\",\"coordinates\":[[[-1.290437,48.010431,70],[-1.290671,48.010365,70],[-1.290702,48.010202,70],[-1.290813,48.009922,70],[-1.29101,48.009988,70],[-1.290986,48.010031,70],[-1.290946,48.010047,70],[-1.290933,48.010109,70],[-1.290976,48.010132,70],[-1.291137,48.010441,69],[-1.291251,48.010697,69],[-1.291359,48.01106,69],[-1.291785,48.011404,70],[-1.291855,48.011516,70],[-1.29208,48.011862,70],[-1.292305,48.011813,70],[-1.292459,48.011912,70],[-1.292958,48.011771,70],[-1.29322,48.011755,71],[-1.293485,48.011827,72],[-1.293584,48.01178,72],[-1.293747,48.011782,72],[-1.294271,48.011722,73],[-1.294681,48.011716,74],[-1.294736,48.011644,74],[-1.294896,48.011091,71],[-1.294983,48.011075,71],[-1.295568,48.011093,70],[-1.295956,48.011126,70],[-1.296542,48.01117,71],[-1.297432,48.011007,72],[-1.298193,48.010864,73],[-1.299207,48.010714,75],[-1.299521,48.010349,75],[-1.299492,48.010215,74],[-1.299132,48.009838,72],[-1.2992,48.009794,72],[-1.299419,48.009811,73],[-1.299603,48.009609,72],[-1.300095,48.008782,67],[-1.30044,48.0082,62],[-1.300814,48.007892,59],[-1.301027,48.007807,59],[-1.301381,48.007783,59],[-1.301634,48.00771,59],[-1.301723,48.007595,58],[-1.302059,48.007552,58],[-1.302227,48.007509,57],[-1.302307,48.007344,57],[-1.302273,48.007183,58],[-1.302406,48.007105,58],[-1.302816,48.007185,58],[-1.303269,48.007461,57],[-1.303472,48.00761,57],[-1.303654,48.007661,57],[-1.303811,48.00761,56],[-1.304125,48.007527,54],[-1.304301,48.007566,54],[-1.304495,48.007713,54],[-1.304578,48.007855,55],[-1.304874,48.008061,55],[-1.305077,48.008137,55],[-1.305755,48.008115,55],[-1.305974,48.007964,55],[-1.306468,48.007476,54],[-1.30685,48.007078,54],[-1.307162,48.006725,54],[-1.307193,48.006613,54],[-1.30705,48.006434,55],[-1.307134,48.006114,56],[-1.307331,48.005964,57],[-1.307334,48.005766,57],[-1.307491,48.005746,57],[-1.307605,48.005799,57],[-1.307802,48.005791,56],[-1.307876,48.005696,56],[-1.307851,48.005587,57],[-1.307654,48.005353,57],[-1.307654,48.005222,57],[-1.307761,48.005088,58],[-1.308171,48.004966,57],[-1.308553,48.004956,57],[-1.308775,48.00503,56],[-1.308864,48.005234,56],[-1.308917,48.005477,56],[-1.309004,48.005582,55],[-1.309158,48.005623,55],[-1.30934,48.005625,56],[-1.309491,48.005582,56],[-1.309809,48.005305,56],[-1.310237,48.005115,55],[-1.310567,48.004959,55],[-1.310738,48.004816,55],[-1.310873,48.004671,55],[-1.310812,48.004537,55],[-1.310713,48.00446,55],[-1.310667,48.004372,55],[-1.310744,48.004195,55],[-1.31096,48.003859,56],[-1.31112,48.003735,56],[-1.311245,48.003578,56],[-1.31139,48.003378,56],[-1.31168,48.003231,56],[-1.311994,48.00319,55],[-1.312237,48.00318,54],[-1.31243,48.003055,54],[-1.312766,48.003032,54],[-1.313065,48.003063,53],[-1.313268,48.003036,53],[-1.313416,48.003028,53],[-1.31358,48.00322,53],[-1.313764,48.003269,53],[-1.313845,48.003397,52],[-1.313949,48.003463,52],[-1.314162,48.003488,52],[-1.314177,48.003591,52],[-1.314134,48.003729,52],[-1.31412,48.003852,51],[-1.314268,48.003963,51],[-1.314511,48.004105,51],[-1.314656,48.004223,52],[-1.314607,48.004409,52],[-1.314475,48.004503,52],[-1.314629,48.004825,52],[-1.314786,48.005052,52],[-1.314897,48.005213,52],[-1.314974,48.005361,52],[-1.314937,48.005605,52],[-1.31481,48.005877,52],[-1.314668,48.006032,52],[-1.314428,48.006164,52],[-1.314231,48.006374,53],[-1.31411,48.00657,53],[-1.314116,48.006693,53],[-1.314307,48.006949,53],[-1.314631,48.007205,53],[-1.314767,48.00731,53],[-1.31477,48.007428,54],[-1.314468,48.007574,55],[-1.314015,48.007929,57],[-1.313433,48.008327,57],[-1.313501,48.008383,58],[-1.313655,48.008327,58],[-1.313898,48.0083,58],[-1.314379,48.008317,60],[-1.31502,48.008451,64],[-1.315488,48.00855,66],[-1.316057,48.008679,67],[-1.316242,48.008869,68],[-1.316492,48.008972,69],[-1.316895,48.0091,70],[-1.31793,48.009438,72],[-1.317767,48.009675,71],[-1.31739,48.010315,68],[-1.316969,48.01107,64],[-1.316679,48.011529,61],[-1.316391,48.011982,59],[-1.316163,48.012027,59],[-1.31599,48.012083,59],[-1.315824,48.012176,58],[-1.315704,48.012277,58],[-1.315364,48.012671,59],[-1.314746,48.01336,62],[-1.314298,48.013862,65],[-1.314147,48.014116,67],[-1.314061,48.014369,68],[-1.313813,48.014722,69],[-1.313529,48.015124,71],[-1.313459,48.015251,71],[-1.313382,48.015279,71],[-1.313265,48.015283,72],[-1.313203,48.015335,72],[-1.313212,48.015413,72],[-1.313299,48.015496,72],[-1.313484,48.015572,72],[-1.313659,48.015628,71],[-1.313804,48.015696,71],[-1.313958,48.015718,71],[-1.31416,48.015733,71],[-1.314163,48.01578,71],[-1.313815,48.016227,73],[-1.313559,48.016578,74],[-1.313562,48.016652,74],[-1.314101,48.016856,73],[-1.315078,48.017196,71],[-1.315678,48.017413,70],[-1.316402,48.017629,68],[-1.316365,48.017773,68],[-1.316354,48.01786,68],[-1.316063,48.018283,69],[-1.31579,48.01847,69],[-1.315485,48.018587,70],[-1.315285,48.018787,70],[-1.314997,48.018753,71],[-1.314739,48.018731,72],[-1.314504,48.01921,72],[-1.314315,48.01966,72],[-1.313959,48.020457,73],[-1.313877,48.020639,74],[-1.313772,48.020921,75],[-1.313553,48.021477,78],[-1.313419,48.021798,80],[-1.313893,48.021796,80],[-1.314577,48.021784,81],[-1.315123,48.021781,81],[-1.31515,48.021828,81],[-1.315114,48.022429,88],[-1.315245,48.022504,88],[-1.315496,48.022502,88],[-1.315601,48.02253,88],[-1.31567,48.022569,88],[-1.315663,48.022875,89],[-1.315877,48.022985,89],[-1.315905,48.023035,89],[-1.315869,48.023485,91],[-1.315809,48.023847,91],[-1.31574,48.024029,91],[-1.315675,48.024199,91],[-1.315596,48.024549,92],[-1.315559,48.024946,92],[-1.315519,48.025196,93],[-1.315443,48.025238,93],[-1.314888,48.025162,94],[-1.314514,48.025092,93],[-1.314172,48.025065,93],[-1.313863,48.025019,94],[-1.313481,48.024951,94],[-1.313101,48.024883,94],[-1.312846,48.024871,94],[-1.312399,48.024922,94],[-1.311857,48.024989,95],[-1.311399,48.025021,95],[-1.310955,48.025067,96],[-1.310654,48.024935,96],[-1.310523,48.024971,96],[-1.310235,48.02501,97],[-1.309803,48.02502,97],[-1.309382,48.02502,97],[-1.308843,48.025147,97],[-1.308265,48.025341,96],[-1.307778,48.025548,97],[-1.307411,48.025643,97],[-1.307089,48.025704,98],[-1.306794,48.025701,98],[-1.306169,48.025638,98],[-1.30545,48.025502,98],[-1.305141,48.025376,96],[-1.304828,48.025281,95],[-1.304471,48.025239,95],[-1.304137,48.025236,95],[-1.303391,48.025251,95],[-1.302777,48.02526,95],[-1.30238,48.025251,94],[-1.302108,48.025243,94],[-1.301537,48.025231,92],[-1.300969,48.025164,90],[-1.300496,48.025156,89],[-1.29994,48.025122,88],[-1.299107,48.02512,88],[-1.29841,48.025129,91],[-1.298068,48.025133,91],[-1.298032,48.02507,91],[-1.298032,48.024649,87],[-1.298015,48.024135,83],[-1.298015,48.023869,82],[-1.298051,48.023346,80],[-1.29809,48.022685,78],[-1.298108,48.022498,78],[-1.298041,48.021583,77],[-1.298007,48.020885,73],[-1.297967,48.020087,71],[-1.297942,48.019333,70],[-1.297934,48.019169,70],[-1.297902,48.019128,70],[-1.29752,48.019147,70],[-1.2972,48.019157,70],[-1.297152,48.019113,70],[-1.297127,48.018977,70],[-1.297014,48.01895,70],[-1.295978,48.019128,72],[-1.294754,48.019339,71],[-1.294681,48.019317,71],[-1.294528,48.019081,71],[-1.294448,48.018967,71],[-1.294463,48.018847,71],[-1.29451,48.018555,71],[-1.294576,48.018343,71],[-1.294659,48.018173,72],[-1.294776,48.018042,72],[-1.294881,48.017686,73],[-1.295075,48.017029,74],[-1.295202,48.016568,74],[-1.295245,48.016187,74],[-1.295223,48.016048,74],[-1.295143,48.015941,75],[-1.294979,48.015888,75],[-1.294739,48.015807,75],[-1.294557,48.015776,76],[-1.294554,48.015454,76],[-1.294536,48.015102,76],[-1.294466,48.014928,76],[-1.294451,48.01477,76],[-1.29444,48.014451,76],[-1.294495,48.014249,76],[-1.294644,48.013868,75],[-1.294637,48.013567,74],[-1.294573,48.013273,73],[-1.2945,48.013134,73],[-1.294293,48.013003,73],[-1.294067,48.012927,73],[-1.293687,48.012885,73],[-1.29332,48.012898,73],[-1.29304,48.012924,73],[-1.292876,48.012861,73],[-1.292791,48.012766,73],[-1.292649,48.012588,73],[-1.292489,48.012488,73],[-1.292005,48.012354,72],[-1.291378,48.012082,71],[-1.290996,48.011936,71],[-1.29082,48.011737,71],[-1.290534,48.011418,70],[-1.290327,48.011142,70],[-1.29017,48.010821,70],[-1.290352,48.010704,70],[-1.290298,48.010573,70],[-1.290438,48.01043,70]]]},\"properties\":{\"name\":\"Circuit du Pont de Quiencé, Bais\"}}\n" +
            "]}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rando_map);
        mapView = findViewById(R.id.mapView);
        mapView.getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS);
    }

    public void onMapClick(View view) {
        this.finish();
    }

    public void onHelpClick(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.visorando.com/"));
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        mapView.onStart();
    }
    @Override
    protected void onStop(){
        super.onStop();
        mapView.onStop();
    }
    @Override
    public void onLowMemory(){
        super.onLowMemory();
        mapView.onLowMemory();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        mapView.onDestroy();
    }



}