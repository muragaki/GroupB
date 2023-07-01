package com.example.reservationsystem.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * 
 * @author Katsuki
 *
 */
@Getter
@AllArgsConstructor
public enum Address {
Hokkaido("北海道","北海道"),
Aomori("青森県","青森県"),
Iwate("岩手県","岩手県"),
Miyagi("宮城県","宮城県"),
Akita("秋田県","秋田県"),
Yamagata("山形県","山形県"),
Hukushima("福島県","福島県"),
Ibaraki("茨城県","茨城県"),
Tochigi("栃木県","栃木県"),
Gunma("群馬県","群馬県"),
Saitama("埼玉県","埼玉県"),
Chiba("千葉県","千葉県"),
Tokyo("東京都","東京都"),
Kanagawa("神奈川県","神奈川県"),
Niigata("新潟県","新潟県"),
Toyama("富山県","富山県"),
Ishikawa("石川県","石川県"),
Fukui("福井県","福井県"),
Yamanashi("山梨県","山梨県"),
Nagano("長野県","長野県"),
Gihu("岐阜県","岐阜県"),
Shizuoka("静岡県","静岡県"),
Aichi("愛知県","愛知県"),
Mie("三重県","三重県"),
Shiga("滋賀県","滋賀県"),
Kyoto("京都府","京都府"),
Osaka("大阪府","大阪府"),
Hyogo("兵庫県","兵庫県"),
Nara("奈良県","奈良県"),
Wakayama("和歌山県","和歌山県"),
Tottori("鳥取県","鳥取県"),
Shimane("島根県","島根県"),
Okayama("岡山県","岡山県"),
Hiroshima("広島県","広島県"),
Yamaguchi("山口県","山口県"),
Tokushima("徳島県","徳島県"),
Kagawa("香川県","香川県"),
Ehime("愛媛県","愛媛県"),
Kochi("高知県","高知県"),
Fukuoka("福岡県","福岡県"),
Saga("佐賀県","佐賀県"),
Nagasaki("長崎県","長崎県"),
Kumamoto("熊本県","熊本県"),
Oita("大分県","大分県"),
Miyazaki("宮崎県","宮崎県"),
Kagoshima("鹿児島県","鹿児島県"),
Okinawa("沖縄県","沖縄県");


	private final String value;
    private final String text;
}

