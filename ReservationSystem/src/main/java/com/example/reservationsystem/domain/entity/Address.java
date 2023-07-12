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
Hokkaido("Hokkaido","北海道"),
Aomori("Aomori","青森県"),
Iwate("Iwate","岩手県"),
Miyagi("Miyagi","宮城県"),
Akita("Akita","秋田県"),
Yamagata("Yamagata","山形県"),
Fukushima("Fukushima","福島県"),
Ibaraki("Ibaraki","茨城県"),
Tochigi("Tochigi","栃木県"),
Gunma("Gunma","群馬県"),
Saitama("Saitama","埼玉県"),
Chiba("Chiba","千葉県"),
Tokyo("Tokyo","東京都"),
Kanagawa("Kanagawa","神奈川県"),
Niigata("Niigata","新潟県"),
Toyama("Toyama","富山県"),
Ishikawa("Ishikawa","石川県"),
Fukui("Fukui","福井県"),
Yamanashi("Yamanashi","山梨県"),
Nagano("Nagano","長野県"),
Gihu("Gihu","岐阜県"),
Shizuoka("Shizuoka","静岡県"),
Aichi("Aichi","愛知県"),
Mie("Mie","三重県"),
Shiga("Shiga","滋賀県"),
Kyoto("Kyoto","京都府"),
Osaka("Osaka","大阪府"),
Hyogo("Hyogo","兵庫県"),
Nara("Nara","奈良県"),
Wakayama("Wakayama","和歌山県"),
Tottori("Tottori","鳥取県"),
Shimane("Shimane","島根県"),
Okayama("Okayama","岡山県"),
Hiroshima("Hiroshima","広島県"),
Yamaguchi("Yamaguchi","山口県"),
Tokushima("Tokushima","徳島県"),
Kagawa("Kagawa","香川県"),
Ehime("Ehime","愛媛県"),
Kochi("Kochi","高知県"),
Fukuoka("Fukuoka","福岡県"),
Saga("Saga","佐賀県"),
Nagasaki("Nagasaki","長崎県"),
Kumamoto("Kumamoto","熊本県"),
Oita("Oita","大分県"),
Miyazaki("Miyazaki","宮崎県"),
Kagoshima("Kagoshima","鹿児島県"),
Okinawa("Okinawa","沖縄県");


	private final String value;
    private final String text;
}

