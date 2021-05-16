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
    private static Button btnLink_Part1, btnLink_Part2, btnLink_Part3, btnLink_Part4, btnLink_Part5,
            btnLink_Part6, btnLink_Part7;
    static String s, s2, s3, s4, s5, s6, s7 = "";
    TextView textfor_size;
    ImageView linkView;
    ImageButton btnFeedback;
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

        btnLink_Part1 = findViewById(R.id.btn_linkToPatreon);
        btnFeedback = findViewById(R.id.btnFeedBack);
        btnLink_Part2 = findViewById(R.id.btn_linkToPatreon_part2);
        btnLink_Part3 = findViewById(R.id.btn_linkToPatreon_part3);
        btnLink_Part4 = findViewById(R.id.btn_linkToPatreon_part4);
        btnLink_Part5 = findViewById(R.id.btn_linkToPatreon_part5);
        btnLink_Part6 = findViewById(R.id.btn_linkToPatreon_part6);
        btnLink_Part7 = findViewById(R.id.btn_linkToPatreon_part7);
        linkView = findViewById(R.id.linkView);
        btnFeedback.setOnClickListener(this);
        linkView.setOnClickListener(this);
        btnLink_Part1.setOnClickListener(this);
        btnLink_Part2.setOnClickListener(this);
        btnLink_Part3.setOnClickListener(this);
        btnLink_Part4.setOnClickListener(this);
        btnLink_Part5.setOnClickListener(this);
        btnLink_Part6.setOnClickListener(this);
        btnLink_Part7.setOnClickListener(this);

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
            if (Activity_6_Dollars.onButtonVisible6doll_2) {
                s2 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p2");
            }
            if (Activity_6_Dollars.onButtonVisible6doll_3) {
                s3 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p3");
            }
            if (Activity_6_Dollars.onButtonVisible6doll_4) {
                s4 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p4");
            }
            if (Activity_6_Dollars.onButtonVisible6doll_5) {
                s5 = MainActivity.mapView.get(Activity_6_Dollars.connectLink + "_p5");
            }
        } else {
            s = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced);
            if (Activity_9_Dollars.onButtonVisible9doll_2) {
                s2 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p2");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_3) {
                s3 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p3");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_4) {
                s4 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p4");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_5) {
                s5 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p5");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_6) {
                s6 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p6");
            }
            if (Activity_9_Dollars.onButtonVisible9doll_7) {
                s7 = MainActivity.mapView.get(Activity_9_Dollars.connectLink_of_advanced + "_p7");
            }
        }
        if (s == null) {
            b = true;
        }
        return b;

    }

    public static void buttonView() {
        if (Activity_6_Dollars.load_galery) {
            if (Activity_6_Dollars.onButtonVisible6doll_2) {
                btnLink_Part2.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.onButtonVisible6doll_3) {
                btnLink_Part3.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.onButtonVisible6doll_4) {
                btnLink_Part4.setVisibility(View.VISIBLE);
            }
            if (Activity_6_Dollars.onButtonVisible6doll_5) {
                btnLink_Part5.setVisibility(View.VISIBLE);
            }
        } else {
            if (Activity_9_Dollars.onButtonVisible9doll_2) {
                btnLink_Part2.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_3) {
                btnLink_Part3.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_4) {
                btnLink_Part4.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_5) {
                btnLink_Part5.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_6) {
                btnLink_Part6.setVisibility(View.VISIBLE);
            }
            if (Activity_9_Dollars.onButtonVisible9doll_7) {
                btnLink_Part7.setVisibility(View.VISIBLE);
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
        s6 = null;
        s7 = null;
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
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
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
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
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
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
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
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
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
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_linkToPatreon_part6:
                try {
                    if (Activity_6_Dollars.load_galery) {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s6));
                        startActivity(intent);
                    } else {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s6));
                        startActivity(intent);
                    }
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_linkToPatreon_part7:
                try {
                    if (Activity_6_Dollars.load_galery) {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s7));
                        startActivity(intent);
                    } else {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s7));
                        startActivity(intent);
                    }
                } catch (Exception e) {
                    Toast.makeText(this, "Данные утеряны", Toast.LENGTH_LONG).show();
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
                }else if (s6 == null) {
                    message =
                            "Часть 1 - " + s + "\n" + "Часть 2 - " + s2 + "\n" + "Часть 3 - " + s3 + "\n" + "Часть 4 - " + s4 + "Часть 5 - " + s5;
                }else if (s7 == null) {
                    message =
                            "Часть 1 - " + s + "\n" + "Часть 2 - " + s2 + "\n" + "Часть 3 - " + s3 + "\n" + "Часть 4 - " + s4 + "\n" + "Часть 5 - " + s5 + "\n" + "Часть 6 - " + s6;
                } else {
                    message =
                            "Часть 1 - " + s + "\n" + "Часть 2 - " + s2 + "\n" + "Часть 3 - " + s3 + "\n" + "Часть 4 - " + s4 + "\n" + "Часть 5 - " + s5+ "\n" + "Часть 6 - " + s6+ "\n" + "Часть 7 - " + s7;
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
        }

    }
}
