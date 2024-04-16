package com.example.flag;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RadioButton uk = findViewById(R.id.UnitedKingdom);
        RadioButton fr = findViewById(R.id.France);
        RadioButton es = findViewById(R.id.Spain);
        RadioButton it = findViewById(R.id.Italy);
        TextView country = findViewById(R.id.Flagtext);
        ImageView flag = findViewById(R.id.flags);
        flag.setImageResource(R.drawable.uk);
        country.setText("A historical tapestry woven with the legacy of a powerful empire, the United Kingdom boasts iconic landmarks like Buckingham Palace and Big Ben, silent testaments to its rich past.  This island nation, comprised of England, Scotland, Wales, and Northern Ireland, transcends its historical significance.  Beyond the grand architecture lies a vibrant cultural landscape, where the birthplace of literary giants like Shakespeare and musical legends like The Beatles continues to inspire.The rolling green hills of the English countryside and the dramatic coastlines invite exploration, while the majestic mountains of Scotland and Wales offer a playground for outdoor enthusiasts.  London, a bustling metropolis, stands as a global center for finance and business, yet the diverse population throughout the UK thrives with strong regional identities, evident in their unique traditions and accents.  This blend of historical significance, vibrant culture, and a modern way of life makes the United Kingdom a truly captivating destination.");

        uk.setOnClickListener(v -> {
           country.setText("A historical tapestry woven with the legacy of a powerful empire, the United Kingdom boasts iconic landmarks like Buckingham Palace and Big Ben, silent testaments to its rich past.  This island nation, comprised of England, Scotland, Wales, and Northern Ireland, transcends its historical significance.  Beyond the grand architecture lies a vibrant cultural landscape, where the birthplace of literary giants like Shakespeare and musical legends like The Beatles continues to inspire.The rolling green hills of the English countryside and the dramatic coastlines invite exploration, while the majestic mountains of Scotland and Wales offer a playground for outdoor enthusiasts.  London, a bustling metropolis, stands as a global center for finance and business, yet the diverse population throughout the UK thrives with strong regional identities, evident in their unique traditions and accents.  This blend of historical significance, vibrant culture, and a modern way of life makes the United Kingdom a truly captivating destination.");
           flag.setImageResource(R.drawable.uk);
       });
        fr.setOnClickListener(v -> {
            country.setText("Immerse yourself in the alluring world of French culture, where fashion reigns supreme and romance fills the air. Ascend the iconic Eiffel Tower for panoramic views of Paris, or lose yourself in the vast collections of the Louvre Museum. Beyond the city lights, explore charming villages nestled amidst rolling vineyards, indulge in the country's world-renowned wines and diverse regional cheeses. Witness the artistic legacy of the Impressionist movement, evident in its museums and galleries. Diverse landscapes beckon, from the majestic peaks of the French Alps to the sun-drenched beaches of the French Riviera, offering a playground for outdoor enthusiasts and relaxation seekers alike. The French way of life is best experienced through its culinary delights, where the art of cooking is celebrated and meals are savored. The French people are proud of their heritage, and their strong sense of national identity is evident in their traditions, festivals, and customs. France is a country that will captivate you with its rich history, artistic treasures, and natural beauty.");
            flag.setImageResource(R.drawable.fr);
        });
        es.setOnClickListener(v -> {
            country.setText("Embark on a captivating journey through Spain, a land pulsating with vibrant traditions. Witness the fiery passion of flamenco dancers, their movements echoing the rich cultural heritage. Be captivated by the excitement (and ethical considerations) surrounding the Running of the Bulls festival, a unique display of local customs. Immerse yourself in the electrifying energy of lively fiestas, where music fills the streets and joy spills over. Explore the historical influence of the Moors in the intricate architecture of Andalusia, a testament to the region's diverse past. Savor the delectable flavors of tapas, a culinary journey through the country's diverse offerings. Bask in the sunshine on Spain's extensive coastline, dotted with pristine beaches and charming coastal towns. Beyond the beaches, the rugged Pyrenees mountains offer a haven for hikers and nature enthusiasts, while the idyllic Balearic Islands provide a taste of island life. Spain's strong footballing tradition fuels a national passion, uniting fans in a shared love for the sport. Spain's rich cultural tapestry, combined with its warm climate and diverse landscapes, makes it a truly captivating destination.");
            flag.setImageResource(R.drawable.es);
        });
        it.setOnClickListener(v -> {
            country.setText("Journey through time in Italy, where ancient echoes of the Roman Empire resonate in the Colosseum and Pantheon. Marvel at artistic masterpieces from the Renaissance masters like Michelangelo, whose sculptures adorn iconic landmarks. Indulge in the country's vibrant culinary scene, savoring regional specialties like wood-fired pizzas, creamy pastas, and fresh seafood along the picturesque Mediterranean coast. Beyond the bustling cities, discover charming hilltop villages offering breathtaking vistas and a glimpse into a slower pace of life. Italy's diverse landscapes, from the rolling hills of Tuscany to the dramatic cliffs of the Amalfi Coast, provide a stunning backdrop for outdoor adventures and relaxation. The Italian people are known for their warmth and hospitality, welcoming visitors with open arms and a passion for life. Italy's rich cultural heritage is celebrated through its festivals, traditions, and religious events, each offering a unique window into the country's history. Italy's timeless beauty, combined with its artistic treasures and culinary delights, makes it a truly captivating destination.");
            flag.setImageResource(R.drawable.it);
        });
    }
}