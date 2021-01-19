// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface UseCreditCardProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.UseCreditCardProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  boolean hasPrompt();
  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  java.lang.String getPrompt();
  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  com.google.protobuf.ByteString
      getPromptBytes();

  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
   */
  boolean hasFormFieldElement();
  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getFormFieldElement();

  /**
   * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
   */
  boolean hasStrings();
  /**
   * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings getStrings();
}
