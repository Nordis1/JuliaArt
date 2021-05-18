package com.Julia_lessons.juliaomelart;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_moveToWatch extends AppCompatActivity implements View.OnClickListener {
    @SuppressLint("StaticFieldLeak")
    private static Button btn_Part1, btn_Part2, btn_Part3, btn_Part4, btn_Part5, btn_Part6, btn_Part7, btn_Boosty;
    static String string_link_1, string_link_2, string_link_3, string_link_4, string_link_5, string_link_6, string_link_7, string_link_Boosty = "";
    TextView textfor_size;
    ImageView linkView;
    ImageButton btnFeedback;
    static boolean nulll = false;
    public static final String TAG = "Descript_Activity";
    @SuppressLint("StaticFieldLeak")
    public static FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nulll = false;
        Log.i(TAG, "onCreate");
        setContentView(R.layout.descript_activity);
        Intent intent = getIntent();
        int viewElement = intent.getIntExtra("intent", 0);

        btn_Part1 = findViewById(R.id.btn_linkToPatreon);
        btnFeedback = findViewById(R.id.btnFeedBack);
        btn_Part2 = findViewById(R.id.btn_linkToPatreon_part2);
        btn_Part3 = findViewById(R.id.btn_linkToPatreon_part3);
        btn_Part4 = findViewById(R.id.btn_linkToPatreon_part4);
        btn_Part5 = findViewById(R.id.btn_linkToPatreon_part5);
        btn_Part6 = findViewById(R.id.btn_linkToPatreon_part6);
        btn_Part7 = findViewById(R.id.btn_linkToPatreon_part7);
        btn_Boosty = findViewById(R.id.btnBoosty);
        linkView = findViewById(R.id.linkView);
        btnFeedback.setOnClickListener(this);
        linkView.setOnClickListener(this);
        btn_Part1.setOnClickListener(this);
        btn_Part2.setOnClickListener(this);
        btn_Part3.setOnClickListener(this);
        btn_Part4.setOnClickListener(this);
        btn_Part5.setOnClickListener(this);
        btn_Part6.setOnClickListener(this);
        btn_Part7.setOnClickListener(this);
        btn_Boosty.setOnClickListener(this);

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

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        if (v.getId() == R.id.frame_from_ActivityDescription) {
            Toast.makeText(this, "Size = " + textfor_size.getText(), Toast.LENGTH_LONG).show();
        }
    }

    public static void setFrameLayout(Integer i) {
        frameLayout.setBackgroundResource(i);
    }

    public static Boolean getLiks() {
        boolean b = false;
        if (Activity_6_Dollars.load_galery) {
            string_link_1 = MainActivity.mapView.get(Activity_6_Dollars.connectLink);
            string_link_Boosty = MainActivity.mapView.get(Activity_6_Dollars.boostyLink6Doll);
            if (Activity_6_Dollars.onButtonVisible6doll_2) {
                string_link_2 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p2");
            }
            if (Activity_6_Dollars.onButtonVisible6doll_3) {
                string_link_3 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p3");
            }
            if (Activity_6_Dollars.onButtonVisible6doll_4) {
                string_link_4 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p4");
            }
            if (Activity_6_Dollars.onButtonVisible6doll_5) {
                string_link_5 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p5");
            }
        } else {
            string_link_1 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced);
            string_link_Boosty = MainActivity.mapView.get(Activity_9_Dollars.boostylink9Doll);
            if (Activity_9_Dollars.onButtonVisible9doll_2) {
                string_link_2 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p2");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_3) {
                string_link_3 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p3");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_4) {
                string_link_4 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p4");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_5) {
                string_link_5 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p5");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_6) {
                string_link_6 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p6");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_7) {
                string_link_7 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p7");
            }
        }
        if (string_link_1 == null) {
            b = true;
        }
        return b;

    }

    public static void buttonView() {
        if (Activity_6_Dollars.load_galery) {
            if (Activity_6_Dollars.onButtonVisible6doll_2) {
                btn_Part2.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.onButtonVisible6doll_3) {
                btn_Part3.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.onButtonVisible6doll_4) {
                btn_Part4.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.onButtonVisible6doll_5) {
                btn_Part5.setVisibility(View.VISIBLE);
            }
        } else {
            if (Activity_9_Dollars.onButtonVisible9doll_2) {
                btn_Part2.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_3) {
                btn_Part3.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_4) {
                btn_Part4.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_5) {
                btn_Part5.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_6) {
                btn_Part6.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_7) {
                btn_Part7.setVisibility(View.VISIBLE);
            }

        }

    }

    @Override
    protected void onDestroy() {
        string_link_1 = null;
        string_link_2 = null;
        string_link_3 = null;
        string_link_4 = null;
        string_link_5 = null;
        string_link_6 = null;
        string_link_7 = null;
        string_link_Boosty = null;
        super.onDestroy();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_linkToPatreon:
                try {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(string_link_1));
                        startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
            case R.id.btn_linkToPatreon_part2:
                try {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(string_link_2));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
            case R.id.btn_linkToPatreon_part3:
                try {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(string_link_3));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
            case R.id.btn_linkToPatreon_part4:
                try {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(string_link_4));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
            case R.id.btn_linkToPatreon_part5:
                try {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(string_link_5));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
            case R.id.btn_linkToPatreon_part6:
                try {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(string_link_6));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
            case R.id.btn_linkToPatreon_part7:
                try {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(string_link_7));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
            case R.id.linkView:
                String message = null;
                if (string_link_2 == null) {
                    message = "Часть 1 - " + string_link_1 + "\n" + "Boosty - " + string_link_Boosty;
                } else if (string_link_3 == null) {
                    message = "Часть 1 - " + string_link_1 + "\n" + "Часть 2 - " + string_link_2 + "\n" + "Boosty - " + string_link_Boosty;
                } else if (string_link_4 == null) {
                    message =
                            "Часть 1 - " + string_link_1 + "\n" + "Часть 2 - " + string_link_2 + "\n" + "Часть 3 - " + string_link_3 + "\n" + "Boosty - " + string_link_Boosty;
                } else if (string_link_5 == null) {
                    message =
                            "Часть 1 - " + string_link_1 + "\n" + "Часть 2 - " + string_link_2 + "\n" + "Часть 3 - " + string_link_3 + "\n" + "Часть 4 - " + string_link_4 + "\n" + "Boosty - " + string_link_Boosty;
                }else if (string_link_6 == null) {
                    message =
                            "Часть 1 - " + string_link_1 + "\n" + "Часть 2 - " + string_link_2 + "\n" + "Часть 3 - " + string_link_3 + "\n" + "Часть 4 - " + string_link_4 + "Часть 5 - " + string_link_5 + "\n" + "Boosty - " + string_link_Boosty;
                }else if (string_link_7 == null) {
                    message =
                            "Часть 1 - " + string_link_1 + "\n" + "Часть 2 - " + string_link_2 + "\n" + "Часть 3 - " + string_link_3 + "\n" + "Часть 4 - " + string_link_4 + "\n" + "Часть 5 - " + string_link_5 + "\n" + "Часть 6 - " + string_link_6 + "\n" + "Boosty - " + string_link_Boosty;
                } else {
                    message =
                            "Часть 1 - " + string_link_1 + "\n" + "Часть 2 - " + string_link_2 + "\n" + "Часть 3 - " + string_link_3 + "\n" + "Часть 4 - " + string_link_4 + "\n" + "Часть 5 - " + string_link_5 + "\n" + "Часть 6 - " + string_link_6 + "\n" + "Часть 7 - " + string_link_7 + "\n" + "Boosty - " + string_link_Boosty;
                }

                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Ссылки на урок");
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Через что передать?"));
                break;
            case R.id.btnFeedBack:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.Julia_lessons.juliaomelart"));
                startActivity(intent);
                break;
            case R.id.btnBoosty:
                try {
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(string_link_Boosty));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                    Log.d(TAG, e.toString());
                }
                break;
        }

    }
}
