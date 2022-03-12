// Generated by view binder compiler. Do not edit!
package com.serviceapps.shopping.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.serviceapps.shopping.R;
import com.serviceapps.shopping.utils.MSPTextView;
import com.serviceapps.shopping.utils.MSPTextViewBold;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySoldProductDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivProductItemImage;

  @NonNull
  public final Toolbar toolbarSoldProductDetailsActivity;

  @NonNull
  public final MSPTextViewBold tvProductItemName;

  @NonNull
  public final MSPTextView tvProductItemPrice;

  @NonNull
  public final MSPTextView tvSoldDetailsAdditionalNote;

  @NonNull
  public final MSPTextView tvSoldDetailsAddress;

  @NonNull
  public final MSPTextView tvSoldDetailsAddressType;

  @NonNull
  public final MSPTextViewBold tvSoldDetailsFullName;

  @NonNull
  public final MSPTextView tvSoldDetailsMobileNumber;

  @NonNull
  public final MSPTextView tvSoldDetailsOtherDetails;

  @NonNull
  public final MSPTextView tvSoldProductDetailsDate;

  @NonNull
  public final MSPTextView tvSoldProductDetailsId;

  @NonNull
  public final MSPTextView tvSoldProductQuantity;

  @NonNull
  public final MSPTextView tvSoldProductShippingCharge;

  @NonNull
  public final MSPTextView tvSoldProductSubTotal;

  @NonNull
  public final MSPTextViewBold tvSoldProductTotalAmount;

  @NonNull
  public final TextView tvTitle;

  private ActivitySoldProductDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView ivProductItemImage, @NonNull Toolbar toolbarSoldProductDetailsActivity,
      @NonNull MSPTextViewBold tvProductItemName, @NonNull MSPTextView tvProductItemPrice,
      @NonNull MSPTextView tvSoldDetailsAdditionalNote, @NonNull MSPTextView tvSoldDetailsAddress,
      @NonNull MSPTextView tvSoldDetailsAddressType, @NonNull MSPTextViewBold tvSoldDetailsFullName,
      @NonNull MSPTextView tvSoldDetailsMobileNumber,
      @NonNull MSPTextView tvSoldDetailsOtherDetails, @NonNull MSPTextView tvSoldProductDetailsDate,
      @NonNull MSPTextView tvSoldProductDetailsId, @NonNull MSPTextView tvSoldProductQuantity,
      @NonNull MSPTextView tvSoldProductShippingCharge, @NonNull MSPTextView tvSoldProductSubTotal,
      @NonNull MSPTextViewBold tvSoldProductTotalAmount, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.ivProductItemImage = ivProductItemImage;
    this.toolbarSoldProductDetailsActivity = toolbarSoldProductDetailsActivity;
    this.tvProductItemName = tvProductItemName;
    this.tvProductItemPrice = tvProductItemPrice;
    this.tvSoldDetailsAdditionalNote = tvSoldDetailsAdditionalNote;
    this.tvSoldDetailsAddress = tvSoldDetailsAddress;
    this.tvSoldDetailsAddressType = tvSoldDetailsAddressType;
    this.tvSoldDetailsFullName = tvSoldDetailsFullName;
    this.tvSoldDetailsMobileNumber = tvSoldDetailsMobileNumber;
    this.tvSoldDetailsOtherDetails = tvSoldDetailsOtherDetails;
    this.tvSoldProductDetailsDate = tvSoldProductDetailsDate;
    this.tvSoldProductDetailsId = tvSoldProductDetailsId;
    this.tvSoldProductQuantity = tvSoldProductQuantity;
    this.tvSoldProductShippingCharge = tvSoldProductShippingCharge;
    this.tvSoldProductSubTotal = tvSoldProductSubTotal;
    this.tvSoldProductTotalAmount = tvSoldProductTotalAmount;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySoldProductDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySoldProductDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sold_product_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySoldProductDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_product_item_image;
      ImageView ivProductItemImage = ViewBindings.findChildViewById(rootView, id);
      if (ivProductItemImage == null) {
        break missingId;
      }

      id = R.id.toolbar_sold_product_details_activity;
      Toolbar toolbarSoldProductDetailsActivity = ViewBindings.findChildViewById(rootView, id);
      if (toolbarSoldProductDetailsActivity == null) {
        break missingId;
      }

      id = R.id.tv_product_item_name;
      MSPTextViewBold tvProductItemName = ViewBindings.findChildViewById(rootView, id);
      if (tvProductItemName == null) {
        break missingId;
      }

      id = R.id.tv_product_item_price;
      MSPTextView tvProductItemPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvProductItemPrice == null) {
        break missingId;
      }

      id = R.id.tv_sold_details_additional_note;
      MSPTextView tvSoldDetailsAdditionalNote = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldDetailsAdditionalNote == null) {
        break missingId;
      }

      id = R.id.tv_sold_details_address;
      MSPTextView tvSoldDetailsAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldDetailsAddress == null) {
        break missingId;
      }

      id = R.id.tv_sold_details_address_type;
      MSPTextView tvSoldDetailsAddressType = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldDetailsAddressType == null) {
        break missingId;
      }

      id = R.id.tv_sold_details_full_name;
      MSPTextViewBold tvSoldDetailsFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldDetailsFullName == null) {
        break missingId;
      }

      id = R.id.tv_sold_details_mobile_number;
      MSPTextView tvSoldDetailsMobileNumber = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldDetailsMobileNumber == null) {
        break missingId;
      }

      id = R.id.tv_sold_details_other_details;
      MSPTextView tvSoldDetailsOtherDetails = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldDetailsOtherDetails == null) {
        break missingId;
      }

      id = R.id.tv_sold_product_details_date;
      MSPTextView tvSoldProductDetailsDate = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldProductDetailsDate == null) {
        break missingId;
      }

      id = R.id.tv_sold_product_details_id;
      MSPTextView tvSoldProductDetailsId = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldProductDetailsId == null) {
        break missingId;
      }

      id = R.id.tv_sold_product_quantity;
      MSPTextView tvSoldProductQuantity = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldProductQuantity == null) {
        break missingId;
      }

      id = R.id.tv_sold_product_shipping_charge;
      MSPTextView tvSoldProductShippingCharge = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldProductShippingCharge == null) {
        break missingId;
      }

      id = R.id.tv_sold_product_sub_total;
      MSPTextView tvSoldProductSubTotal = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldProductSubTotal == null) {
        break missingId;
      }

      id = R.id.tv_sold_product_total_amount;
      MSPTextViewBold tvSoldProductTotalAmount = ViewBindings.findChildViewById(rootView, id);
      if (tvSoldProductTotalAmount == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivitySoldProductDetailsBinding((ConstraintLayout) rootView, ivProductItemImage,
          toolbarSoldProductDetailsActivity, tvProductItemName, tvProductItemPrice,
          tvSoldDetailsAdditionalNote, tvSoldDetailsAddress, tvSoldDetailsAddressType,
          tvSoldDetailsFullName, tvSoldDetailsMobileNumber, tvSoldDetailsOtherDetails,
          tvSoldProductDetailsDate, tvSoldProductDetailsId, tvSoldProductQuantity,
          tvSoldProductShippingCharge, tvSoldProductSubTotal, tvSoldProductTotalAmount, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
