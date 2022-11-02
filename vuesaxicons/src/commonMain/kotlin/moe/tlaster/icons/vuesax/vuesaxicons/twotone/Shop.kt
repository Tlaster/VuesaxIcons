package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0005f, 12.0f)
                curveTo(13.8305f, 12.0f, 15.1805f, 10.51f, 15.0005f, 8.68f)
                lineTo(14.3405f, 2.0f)
                horizontalLineTo(9.6705f)
                lineTo(9.0005f, 8.68f)
                curveTo(8.8205f, 10.51f, 10.1705f, 12.0f, 12.0005f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3108f, 12.0f)
                curveTo(20.3308f, 12.0f, 21.8108f, 10.36f, 21.6108f, 8.35f)
                lineTo(21.3308f, 5.6f)
                curveTo(20.9708f, 3.0f, 19.9708f, 2.0f, 17.3508f, 2.0f)
                horizontalLineTo(14.3008f)
                lineTo(15.0008f, 9.01f)
                curveTo(15.1708f, 10.66f, 16.6608f, 12.0f, 18.3108f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.6404f, 12.0f)
                curveTo(7.2904f, 12.0f, 8.7804f, 10.66f, 8.9404f, 9.01f)
                lineTo(9.1604f, 6.8f)
                lineTo(9.6404f, 2.0f)
                horizontalLineTo(6.5904f)
                curveTo(3.9704f, 2.0f, 2.9704f, 3.0f, 2.6104f, 5.6f)
                lineTo(2.3404f, 8.35f)
                curveTo(2.1404f, 10.36f, 3.6204f, 12.0f, 5.6404f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0098f, 11.2197f)
                verticalLineTo(15.7097f)
                curveTo(3.0098f, 20.1997f, 4.8098f, 21.9997f, 9.2998f, 21.9997f)
                horizontalLineTo(14.6898f)
                curveTo(19.1798f, 21.9997f, 20.9798f, 20.1997f, 20.9798f, 15.7097f)
                verticalLineTo(11.2197f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(10.33f, 17.0f, 9.5f, 17.83f, 9.5f, 19.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(19.5f)
                curveTo(14.5f, 17.83f, 13.67f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
