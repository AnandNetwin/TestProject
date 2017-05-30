package com.abc.widgets;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;




public class CustomDialogManager {

    private static final int ANIM_TIME = 100;

    public static void showOkCancelDialog(Context context, String string, String s, final DialogListener dialogListener) {
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        final AlertDialog okCancelDialog;
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_yes_no, null);
        build.setView(view);
        okCancelDialog = build.create();
        final TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        final TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);
        final ImageView ivClose = (ImageView) view.findViewById(R.id.ivClose);
        final TextView btnNo = (TextView) view.findViewById(R.id.btnNo);
        final TextView btnYes = (TextView) view.findViewById(R.id.btnYes);
        ivClose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
            }
        });

        btnYes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
                if (dialogListener != null)
                    dialogListener.onButtonClicked(Dialog.BUTTON_POSITIVE);
            }
        });

        btnNo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
                if (dialogListener != null)
                    dialogListener.onButtonClicked(Dialog.BUTTON_NEGATIVE);
            }

        });
        tvTitle.setText("");
        tvMessage.setText("");
        okCancelDialog.show();
    }

    public static void showOkCancelDialog(Context context, String message, final DialogListener dialogListener) {
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        final AlertDialog okCancelDialog;
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_yes_no, null);
        build.setView(view);
        okCancelDialog = build.create();
        okCancelDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        final TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        final TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);
        final TextView btnYes = (TextView) view.findViewById(R.id.btnYes);
        btnYes.setText("Yes");
        final TextView btnNo = (TextView) view.findViewById(R.id.btnNo);
        btnNo.setText("No");


        btnYes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
                if (dialogListener != null)
                    dialogListener.onButtonClicked(Dialog.BUTTON_POSITIVE);
            }
        });

        btnNo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
                if (dialogListener != null)
                    dialogListener.onButtonClicked(Dialog.BUTTON_NEGATIVE);
            }

        });
        tvTitle.setText(R.string.app_name);
        if (TextUtils.isEmpty(message))
            tvMessage.setText("");
        else
            tvMessage.setText(message);

        okCancelDialog.show();
    }

    public static void showOkCancelDialog(Context context, String message, String yesButtonMessage, String noButtonMessage,
                                          final DialogListener dialogListener) {
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        final AlertDialog okCancelDialog;
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_yes_no, null);
        build.setView(view);
        okCancelDialog = build.create();
        okCancelDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        final TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        final TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);

        final TextView btnYes = (TextView) view.findViewById(R.id.btnYes);
        btnYes.setText(yesButtonMessage);
        final TextView btnNo = (TextView) view.findViewById(R.id.btnNo);
        btnNo.setText(noButtonMessage);



        btnYes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
                if (dialogListener != null)
                    dialogListener.onButtonClicked(Dialog.BUTTON_POSITIVE);
            }
        });

        btnNo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
                if (dialogListener != null)
                    dialogListener.onButtonClicked(Dialog.BUTTON_NEGATIVE);
            }

        });
        tvTitle.setText(context.getString(R.string.app_name));
        if (TextUtils.isEmpty(message))
            tvMessage.setText("");
        else
            tvMessage.setText(message);

        okCancelDialog.show();
    }

    public static void showOkDialog(final Context context, String message) {
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        final AlertDialog okCancelDialog;
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_ok, null);
        build.setView(view);
        okCancelDialog = build.create();
        okCancelDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        final TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        final TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);
        final TextView btnYes = (TextView) view.findViewById(R.id.btnYes);
        btnYes.setText("OK");
        btnYes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
            }
        });


        tvTitle.setText(R.string.app_name);

        if (TextUtils.isEmpty(message))
            tvMessage.setText("");

        else
            tvMessage.setText(message);

        okCancelDialog.show();
        okCancelDialog.setCanceledOnTouchOutside(false);
    }




    public static void showOkTitleDialog(final Context context, String title, String message) {
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        final AlertDialog okCancelDialog;
        View view = LayoutInflater.from(context).inflate(R.layout.status_dialog, null);
        build.setView(view);
        okCancelDialog = build.create();
        okCancelDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        final TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        final TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);
        final ImageView ivClose = (ImageView) view.findViewById(R.id.ivClose);
        final TextView btnYes = (TextView) view.findViewById(R.id.btnYes);
        btnYes.setText("OK");
        btnYes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
            }
        });

        ivClose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
            }
        });
        tvTitle.setText(R.string.app_name);

        if (TextUtils.isEmpty(message))
            tvMessage.setText("");

        else
            tvMessage.setText(message);

        if(TextUtils.isEmpty(title))
            tvTitle.setText("");
        else
        tvTitle.setText(title);

        okCancelDialog.show();
    }

    //Dialog for single ok Button

    public static void showOkDialog(Context context, CharSequence message, final DialogListener dialogListener) {
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        final AlertDialog okCancelDialog;
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_ok, null);
        build.setView(view);
        okCancelDialog = build.create();
        okCancelDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        final TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        final TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);

        final TextView btnYes = (TextView) view.findViewById(R.id.btnYes);
        btnYes.setText("Ok");

        btnYes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
                if (dialogListener != null)
                    dialogListener.onButtonClicked(Dialog.BUTTON_POSITIVE);
            }
        });


        tvTitle.setText(R.string.app_name);
        if (TextUtils.isEmpty(message))
            tvMessage.setText("");
        else
            tvMessage.setText(message);

        okCancelDialog.show();
        okCancelDialog.setCanceledOnTouchOutside(false);
    }

    public static void showReloginDialog(final Context context) {
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        final AlertDialog okCancelDialog;
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_yes_no, null);
        build.setView(view);
        okCancelDialog = build.create();
        okCancelDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        final TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        final TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);
        final ImageView ivClose = (ImageView) view.findViewById(R.id.ivClose);
        final Button btnYes = (Button) view.findViewById(R.id.btnYes);
        final Button btnNo = (Button) view.findViewById(R.id.btnNo);
        btnYes.setText("Ok");
        btnNo.setText("No");

        btnNo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
            }
        });
        btnYes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ivClose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
            }
        });

        tvTitle.setText(R.string.app_name);
        tvMessage.setText("For showing MyProfile screen you need to login first,Do you want to login?");

        okCancelDialog.show();
        okCancelDialog.setCanceledOnTouchOutside(false);
    }

    public static void showOkDialog(CharSequence context, CharSequence title, Context message) {
        AlertDialog.Builder build = new AlertDialog.Builder((Context) context);
        final AlertDialog okCancelDialog;
        View view = LayoutInflater.from((Context) context).inflate(R.layout.dialog_yes,
                null);
        build.setView(view);
        okCancelDialog = build.create();
        okCancelDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        final TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        final TextView tvMessage = (TextView) view.findViewById(R.id.tvMessage);
        final ImageView ivClose = (ImageView) view.findViewById(R.id.ivClose);
        final TextView btnYes = (TextView) view.findViewById(R.id.btnYes);
        btnYes.setText("Ok");

        btnYes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();

            }
        });

        ivClose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
            }
        });
        if (TextUtils.isEmpty(title))
            tvTitle.setText(R.string.app_name);
        else
            tvTitle.setText(title);

        if (TextUtils.isEmpty((CharSequence) message))
            tvMessage.setText("");
        else
            tvMessage.setText((CharSequence) message);

        okCancelDialog.show();
    }

    public static Dialog showProgressDialog_Old(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setContentView(R.layout.vw_custom_progress_bar);

        WebView imageView=(WebView) dialog.findViewById(R.id.imageView1);
        imageView.setBackgroundColor(Color.TRANSPARENT); //for gif without background
        imageView.loadUrl("file:///android_asset/html/logo_h.html");

        dialog.setCancelable(false);
        dialog.show();
        return dialog;
    }

    /*public static Dialog showProgressDialog(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.vw_custom_progress_bar);

        dialog.setCancelable(false);
        dialog.show();
        return dialog;
    }*/

    public static void showShortToast(CharSequence msg, Context ctx) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }
    //Method for showing SnackBar

    public static void showSnackbar(View view, String msg, Context context) {
        final Snackbar snackbar = Snackbar.make(view, msg, Snackbar.LENGTH_LONG);
        snackbar.getView().setBackgroundColor(ContextCompat.getColor(context, R.color.colorWhite));
        snackbar.show();
    }

   //Method for Custom snackbar on click

    public static void showSnackbar(View view, String message, String actionName, Context context, final SnackBarListener snackBarListener) {
        final Snackbar snackbar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                .setAction(actionName, new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        snackBarListener.onActionClicked();

                    }
                });
        snackbar.getView().setBackgroundColor(ContextCompat.getColor(context, R.color.colorAccent));
        snackbar.show();
    }

    //Method to upload image
    public static void showImagePickDialog(final Context context, String title, final ImageDialogActionListener listener) {
        final Dialog dialog= new Dialog(context, R.style.CustomDialog);
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_add_photo_option, null);
        dialog.setContentView(view);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.getWindow().setAttributes(lp);

        final TextView tvCamera= (TextView) view.findViewById(R.id.tvCamera);
        final TextView tvGallery = (TextView) view.findViewById(R.id.tvGallery);
        final ImageView ivCamera = (ImageView)view.findViewById(R.id.ivCamera);
        final ImageView ivGallery = (ImageView)view.findViewById(R.id.ivGallery);
        final TextView tvUploadImage = (TextView)view.findViewById(R.id.tvUploadImage);

        tvUploadImage.setText(title);

        //Adding animation effects to the view
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(context, R.anim.animation_rotate);
        Animation zoom_in = AnimationUtils.loadAnimation(context, R.anim.animation_zoom_in);
        Animation zoom_animation = AnimationUtils.loadAnimation(context, R.anim.animation_zoom_in);

        tvUploadImage.startAnimation(zoom_animation);
        tvCamera.startAnimation(zoom_in);
        tvGallery.startAnimation(zoom_in);

        ivCamera.startAnimation(hyperspaceJumpAnimation);
        ivGallery.startAnimation(hyperspaceJumpAnimation);

        ivCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                if (listener != null)
                    listener.onCameraOptionClicked();
            }
        });

        ivGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                if (listener != null)
                    listener.onGalleryOptionClicked();
            }
        });

        dialog.setCancelable(true);
        dialog.show();
    }


    public static void showImageDialog(Context context, String url, ImageLoader loader, DisplayImageOptions options){

        if (!HttpHelper.isNetworkAvailable(context)){
            CustomDialogManager.showOkDialog(context, context.getString(R.string.no_internet_connection));
            return;
        }
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        View view = View.inflate(context, R.layout.dialog_imageview, null);
        final ImageView ivPostImage = (ImageView) view.findViewById(R.id.ivPostImage);;
        ImageView ivClose = (ImageView) view.findViewById(R.id.ivClose);
        ivClose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        loader.displayImage(url,ivPostImage,options);
        dialog.setContentView(view);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setCancelable(true);
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }

    public static void showVideoDialog(Context context, String videoUrl){

        if (!HttpHelper.isNetworkAvailable(context)){
            CustomDialogManager.showOkDialog(context, context.getString(R.string.no_internet_connection));
            return;
        }
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        View view = View.inflate(context, R.layout.dialog_videoview, null);
        final EMVideoView emVideoView = (EMVideoView)view.findViewById(R.id.video_view);;
        ImageView ivClose = (ImageView) view.findViewById(R.id.ivClose);
        ivClose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                emVideoView.stopPlayback();
                dialog.dismiss();
            }
        });
        emVideoView.setOnPreparedListener(new OnPreparedListener() {
            @Override
            public void onPrepared() {
                emVideoView.start();
            }
        });
        emVideoView.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion() {
                dialog.dismiss();
               // emVideoView.restart();
            }
        });
        emVideoView.setVideoURI(Uri.parse(videoUrl));
        dialog.setContentView(view);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setCancelable(true);
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }


    public static void showRoleSelectionDialog(final Context context, final RoleSelectionListener dialogListener) {
        AlertDialog.Builder build = new AlertDialog.Builder(context);
        final AlertDialog okCancelDialog;
        View view = View.inflate(context, R.layout.dialog_role_selection,null);
        build.setView(view);
        okCancelDialog = build.create();
        final Button btSubmit = (Button) view.findViewById(R.id.btSubmit);
        final CheckBox cbGolfer = (CheckBox) view.findViewById(R.id.cbGolfer);
        final CheckBox cbCompany = (CheckBox) view.findViewById(R.id.cbCompany);
        final CheckBox cbTrader = (CheckBox) view.findViewById(R.id.cbTrader);
        final CheckBox cbCourse = (CheckBox) view.findViewById(R.id.cbCourse);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okCancelDialog.dismiss();
                try {
                    String roleIds = "";
                    String roleNames = "";
                    if (cbGolfer.isChecked()) {
                        roleIds += Constants.PARAM_GOLFER + ",";
                        roleNames += context.getString(R.string.golfer)+ ",";
                    }
                    if (cbCompany.isChecked()) {
                        roleIds += Constants.PARAM_COMPANY + ",";
                        roleNames += context.getString(R.string.company)+ ",";
                    }
                    if (cbTrader.isChecked()) {
                        roleIds += Constants.PARAM_TRADER + ",";
                        roleNames += context.getString(R.string.trader)+ ",";
                    }
                    if (cbCourse.isChecked()) {
                        roleIds += Constants.PARAM_COURSE + ",";
                        roleNames += context.getString(R.string.course)+ ",";
                    }
                    if (!TextUtils.isEmpty(roleIds))
                        roleIds = roleIds.substring(0, roleIds.length()-1);
                    if (!TextUtils.isEmpty(roleNames))
                        roleNames = roleNames.substring(0, roleNames.length()-1);

                    if (dialogListener != null)
                        dialogListener.onRoleSelected(roleIds, roleNames);
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        });
        okCancelDialog.setCancelable(true);
        okCancelDialog.show();
    }

    public static Dialog showProgressDialog(Context context){
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_progress);

        ImageView imageView = (ImageView)dialog.findViewById(R.id.ivAnim);
        imageView.setBackgroundResource(R.drawable.loading_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) imageView.getBackground();
        frameAnimation.start();

  /*ImageView ivLoading=(ImageView) dialog.findViewById(R.id.ivback);
  RotateAnimation mRotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,0.5f);
  mRotateAnimation.setInterpolator(new LinearInterpolator());
  mRotateAnimation.setDuration(2000);
  mRotateAnimation.setRepeatCount(Animation.INFINITE);
  mRotateAnimation.setRepeatMode(Animation.RESTART);
  mRotateAnimation.setFillAfter(true);
  ivLoading.startAnimation(mRotateAnimation);*/
        dialog.setCancelable(false);
        dialog.show();
        return dialog;
    }


}
