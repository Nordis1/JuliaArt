package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_moveToWatch extends AppCompatActivity implements View.OnClickListener {
    private static Button btnLink, btnLink_Part2, btnLink_Part3, btnLink_Part4, btnLink_Part5;
    static String s, s2, s3, s4, s5 = "";
    TextView textfor_size;
    ImageView linkView;
    static boolean nulll = false;
    public static final String TAG = "Descript_Activity";
    public static FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nulll = false;
        Log.i(TAG, "onCreate");
        setContentView(R.layout.descript_activity);
        Intent intent = getIntent();
        int viewElement = intent.getIntExtra("intent", 0);

        btnLink = findViewById(R.id.btn_linkToPatreon);
        btnLink_Part2 = findViewById(R.id.btn_linkToPatreon_part2);
        btnLink_Part3 = findViewById(R.id.btn_linkToPatreon_part3);
        btnLink_Part4 = findViewById(R.id.btn_linkToPatreon_part4);
        btnLink_Part5 = findViewById(R.id.btn_linkToPatreon_part5);
        linkView = findViewById(R.id.linkView);
        linkView.setOnClickListener(this);
        btnLink.setOnClickListener(this);
        btnLink_Part2.setOnClickListener(this);
        btnLink_Part3.setOnClickListener(this);
        btnLink_Part4.setOnClickListener(this);
        btnLink_Part5.setOnClickListener(this);

        textfor_size = findViewById(R.id.id_textSize1);

        frameLayout = findViewById(R.id.frame_from_ActivityDescription);
        registerForContextMenu(frameLayout);
        Log.d(TAG, "номер картинки " + viewElement);
        setFrameLayout(viewElement); // рабочий
        buttonView();
        nulll = getLiks();
        if (nulll) {
            Log.i(TAG, "зашёл в в сброс активити ");
            Intent i = new Intent(this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.frame_from_ActivityDescription:
                Toast.makeText(this, "Size = " + textfor_size.getText(), Toast.LENGTH_LONG).show();
        }
    }

    public static void setFrameLayout(Integer i) {
        frameLayout.setBackgroundResource(i);
    }

    public static Boolean getLiks() {
        boolean b = false;
        if (Activity_6_Dollars.load_galery) {
            s = MainActivity.mapView.get(Activity_6_Dollars.connectLink);
            if (Activity_6_Dollars.part2) {
                s2 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p2");
            }
            if (Activity_6_Dollars.part3) {
                s3 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p3");
            }
            if (Activity_6_Dollars.part4) {
                s4 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p4");
            }
            if (Activity_6_Dollars.part5) {
                s5 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p5");
            }
        } else {
            s = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced);
            if (Activity_9_Dollars.part2) {
                s2 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p2");
            }
            if (Activity_9_Dollars.part3) {
                s3 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p3");
            }
            if (Activity_9_Dollars.part4) {
                s4 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p4");
            }
            if (Activity_9_Dollars.part5) {
                s5 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p5");
            }
        }
        if (s == null) {
            b = true;
        }
        return b;

    }

    public static void buttonView() {
        if (Activity_6_Dollars.load_galery) {
            if (Activity_6_Dollars.part2) {
                btnLink_Part2.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.part3) {
                btnLink_Part3.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.part4) {
                btnLink_Part4.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.part5) {
                btnLink_Part5.setVisibility(View.VISIBLE);
            }
        } else {
            if (Activity_9_Dollars.part2) {
                btnLink_Part2.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.part3) {
                btnLink_Part3.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.part4) {
                btnLink_Part4.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.part5) {
                btnLink_Part5.setVisibility(View.VISIBLE);
            }

        }

    }

    @Override
    protected void onDestroy() {
        s = null;
        s2 = null;
        s3 = null;
        s4 = null;
        s5 = null;
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_linkToPatreon:
                try {
                    if (Activity_6_Dollars.load_galery) {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                        startActivity(intent);
                    } else {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s));
                        startActivity(intent);
                    }
                } catch (Exception e) {
                    Toast.makeText(this,"Данные утеряны",Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
            case R.id.btn_linkToPatreon_part2:
                try {
                    if (Activity_6_Dollars.load_galery) {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s2));
                        startActivity(intent);
                    } else {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s2));
                        startActivity(intent);
                    }
                } catch (Exception e) {
                    Toast.makeText(this,"Данные утеряны",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_linkToPatreon_part3:
                try {
                    if (Activity_6_Dollars.load_galery) {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s3));
                        startActivity(intent);
                    } else {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s3));
                        startActivity(intent);
                    }
                } catch (Exception e) {
                    Toast.makeText(this,"Данные утеряны",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_linkToPatreon_part4:
                try {
                    if (Activity_6_Dollars.load_galery) {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s4));
                        startActivity(intent);
                    } else {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s4));
                        startActivity(intent);
                    }
                } catch (Exception e) {
                    Toast.makeText(this,"Данные утеряны",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_linkToPatreon_part5:
                try {
                    if (Activity_6_Dollars.load_galery) {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s5));
                        startActivity(intent);
                    } else {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s5));
                        startActivity(intent);
                    }
                } catch (Exception e) {
                    Toast.makeText(this,"Данные утеряны",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.linkView:
                String message = null;
                if (s2 == null) {
                    message = "Часть 1 - " + s;
                } else if (s3 == null) {
                    message = "Часть 1 - " + s + "\n" + "Часть 2 - " + s2;
                } else if (s4 == null) {
                    message =
                            "Часть 1 - " + s + "\n" + "Часть 2 - " + s2 + "\n" + "Часть 3 - " + s3;
                } else if (s5 == null) {
                    message =
                            "Часть 1 - " + s + "\n" + "Часть 2 - " + s2 + "\n" + "Часть 3 - " + s3 + "\n" + "Часть 4 - " + s4;
                } else {
                    message =
                            "Часть 1 - " + s + "\n" + "Часть 2 - " + s2 + "\n" + "Часть 3 - " + s3 + "\n" + "Часть 4 - " + s4 + "\n" + "Часть 5 - " + s5;
                }

                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Ссылки на урок");
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Через что передать?"));
                break;
        }

    }
}
