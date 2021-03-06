package com.smkrevit.ukom;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FormulirPenyewaan extends AppCompatActivity {

        private DatePickerDialog datePickerDialog;
        private SimpleDateFormat dateFormatter;
        private TextView tvDateResult;
        private Button btDatePicker;
        private Button btndate;
        private TextView tvdate;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_formulir_penyewaan);

            /**
             * Kita menggunakan format tanggal dd-MM-yyyy
             * jadi nanti tanggal nya akan diformat menjadi
             * misalnya 01-12-2017
             */
            dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

            tvDateResult = (TextView) findViewById(R.id.tv_dateresult);
            btDatePicker = (Button) findViewById(R.id.bt_datepicker);
            btDatePicker.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick(View view) {
                    showDateDialog();
                }
            });

        }

        private void showDateDialog(){

            /**
             * Calendar untuk mendapatkan tanggal sekarang
             */
            Calendar newCalendar = Calendar.getInstance();

            /**
             * Initiate DatePicker dialog
             */
            datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                    /**
                     * Method ini dipanggil saat kita selesai memilih tanggal di DatePicker
                     */

                    /**
                     * Set Calendar untuk menampung tanggal yang dipilih
                     */
                    Calendar newDate = Calendar.getInstance();
                    newDate.set(year, monthOfYear, dayOfMonth);

                    /**
                     * Update TextView dengan tanggal yang kita pilih
                     */
                    tvDateResult.setText("Mulai : "+dateFormatter.format(newDate.getTime()));
                }

            },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

            /**
             * Tampilkan DatePicker dialog
             */
            datePickerDialog.show();
        }
    }