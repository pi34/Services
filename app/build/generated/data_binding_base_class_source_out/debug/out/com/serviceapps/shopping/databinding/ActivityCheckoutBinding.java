// Generated by view binder compiler. Do not edit!
package com.serviceapps.shopping.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.serviceapps.shopping.R;
import com.serviceapps.shopping.utils.MSPButton;
import com.serviceapps.shopping.utils.MSPTextView;
import com.serviceapps.shopping.utils.MSPTextViewBold;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCheckoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final MSPButton btnPlaceOrder;

  @NonNull
  public final LinearLayout llCheckoutAddressDetails;

  @NonNull
  public final LinearLayout llCheckoutPlaceOrder;

  @NonNull
  public final RecyclerView rvCartListItems;

  @NonNull
  public final Toolbar toolbarCheckoutActivity;

  @NonNull
  public final MSPTextView tvCheckoutAdditionalNote;

  @NonNull
  public final MSPTextView tvCheckoutAddress;

  @NonNull
  public final MSPTextView tvCheckoutAddressType;

  @NonNull
  public final MSPTextViewBold tvCheckoutFullName;

  @NonNull
  public final MSPTextView tvCheckoutMobileNumber;

  @NonNull
  public final MSPTextView tvCheckoutOtherDetails;

  @NonNull
  public final MSPTextView tvCheckoutShippingCharge;

  @NonNull
  public final MSPTextView tvCheckoutSubTotal;

  @NonNull
  public final MSPTextViewBold tvCheckoutTotalAmount;

  @NonNull
  public final MSPTextView tvItemsReceipt;

  @NonNull
  public final MSPTextViewBold tvPaymentMode;

  @NonNull
  public final MSPTextView tvProductItems;

  @NonNull
  public final MSPTextView tvSelectedAddress;

  @NonNull
  public final TextView tvTitle;

  private ActivityCheckoutBinding(@NonNull RelativeLayout rootView,
      @NonNull MSPButton btnPlaceOrder, @NonNull LinearLayout llCheckoutAddressDetails,
      @NonNull LinearLayout llCheckoutPlaceOrder, @NonNull RecyclerView rvCartListItems,
      @NonNull Toolbar toolbarCheckoutActivity, @NonNull MSPTextView tvCheckoutAdditionalNote,
      @NonNull MSPTextView tvCheckoutAddress, @NonNull MSPTextView tvCheckoutAddressType,
      @NonNull MSPTextViewBold tvCheckoutFullName, @NonNull MSPTextView tvCheckoutMobileNumber,
      @NonNull MSPTextView tvCheckoutOtherDetails, @NonNull MSPTextView tvCheckoutShippingCharge,
      @NonNull MSPTextView tvCheckoutSubTotal, @NonNull MSPTextViewBold tvCheckoutTotalAmount,
      @NonNull MSPTextView tvItemsReceipt, @NonNull MSPTextViewBold tvPaymentMode,
      @NonNull MSPTextView tvProductItems, @NonNull MSPTextView tvSelectedAddress,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnPlaceOrder = btnPlaceOrder;
    this.llCheckoutAddressDetails = llCheckoutAddressDetails;
    this.llCheckoutPlaceOrder = llCheckoutPlaceOrder;
    this.rvCartListItems = rvCartListItems;
    this.toolbarCheckoutActivity = toolbarCheckoutActivity;
    this.tvCheckoutAdditionalNote = tvCheckoutAdditionalNote;
    this.tvCheckoutAddress = tvCheckoutAddress;
    this.tvCheckoutAddressType = tvCheckoutAddressType;
    this.tvCheckoutFullName = tvCheckoutFullName;
    this.tvCheckoutMobileNumber = tvCheckoutMobileNumber;
    this.tvCheckoutOtherDetails = tvCheckoutOtherDetails;
    this.tvCheckoutShippingCharge = tvCheckoutShippingCharge;
    this.tvCheckoutSubTotal = tvCheckoutSubTotal;
    this.tvCheckoutTotalAmount = tvCheckoutTotalAmount;
    this.tvItemsReceipt = tvItemsReceipt;
    this.tvPaymentMode = tvPaymentMode;
    this.tvProductItems = tvProductItems;
    this.tvSelectedAddress = tvSelectedAddress;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCheckoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_checkout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCheckoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_place_order;
      MSPButton btnPlaceOrder = ViewBindings.findChildViewById(rootView, id);
      if (btnPlaceOrder == null) {
        break missingId;
      }

      id = R.id.ll_checkout_address_details;
      LinearLayout llCheckoutAddressDetails = ViewBindings.findChildViewById(rootView, id);
      if (llCheckoutAddressDetails == null) {
        break missingId;
      }

      id = R.id.ll_checkout_place_order;
      LinearLayout llCheckoutPlaceOrder = ViewBindings.findChildViewById(rootView, id);
      if (llCheckoutPlaceOrder == null) {
        break missingId;
      }

      id = R.id.rv_cart_list_items;
      RecyclerView rvCartListItems = ViewBindings.findChildViewById(rootView, id);
      if (rvCartListItems == null) {
        break missingId;
      }

      id = R.id.toolbar_checkout_activity;
      Toolbar toolbarCheckoutActivity = ViewBindings.findChildViewById(rootView, id);
      if (toolbarCheckoutActivity == null) {
        break missingId;
      }

      id = R.id.tv_checkout_additional_note;
      MSPTextView tvCheckoutAdditionalNote = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutAdditionalNote == null) {
        break missingId;
      }

      id = R.id.tv_checkout_address;
      MSPTextView tvCheckoutAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutAddress == null) {
        break missingId;
      }

      id = R.id.tv_checkout_address_type;
      MSPTextView tvCheckoutAddressType = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutAddressType == null) {
        break missingId;
      }

      id = R.id.tv_checkout_full_name;
      MSPTextViewBold tvCheckoutFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutFullName == null) {
        break missingId;
      }

      id = R.id.tv_checkout_mobile_number;
      MSPTextView tvCheckoutMobileNumber = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutMobileNumber == null) {
        break missingId;
      }

      id = R.id.tv_checkout_other_details;
      MSPTextView tvCheckoutOtherDetails = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutOtherDetails == null) {
        break missingId;
      }

      id = R.id.tv_checkout_shipping_charge;
      MSPTextView tvCheckoutShippingCharge = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutShippingCharge == null) {
        break missingId;
      }

      id = R.id.tv_checkout_sub_total;
      MSPTextView tvCheckoutSubTotal = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutSubTotal == null) {
        break missingId;
      }

      id = R.id.tv_checkout_total_amount;
      MSPTextViewBold tvCheckoutTotalAmount = ViewBindings.findChildViewById(rootView, id);
      if (tvCheckoutTotalAmount == null) {
        break missingId;
      }

      id = R.id.tv_items_receipt;
      MSPTextView tvItemsReceipt = ViewBindings.findChildViewById(rootView, id);
      if (tvItemsReceipt == null) {
        break missingId;
      }

      id = R.id.tv_payment_mode;
      MSPTextViewBold tvPaymentMode = ViewBindings.findChildViewById(rootView, id);
      if (tvPaymentMode == null) {
        break missingId;
      }

      id = R.id.tv_product_items;
      MSPTextView tvProductItems = ViewBindings.findChildViewById(rootView, id);
      if (tvProductItems == null) {
        break missingId;
      }

      id = R.id.tv_selected_address;
      MSPTextView tvSelectedAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvSelectedAddress == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ActivityCheckoutBinding((RelativeLayout) rootView, btnPlaceOrder,
          llCheckoutAddressDetails, llCheckoutPlaceOrder, rvCartListItems, toolbarCheckoutActivity,
          tvCheckoutAdditionalNote, tvCheckoutAddress, tvCheckoutAddressType, tvCheckoutFullName,
          tvCheckoutMobileNumber, tvCheckoutOtherDetails, tvCheckoutShippingCharge,
          tvCheckoutSubTotal, tvCheckoutTotalAmount, tvItemsReceipt, tvPaymentMode, tvProductItems,
          tvSelectedAddress, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
