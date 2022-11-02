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

public val TwotoneGroup.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.4997f, 22.0003f)
                horizontalLineTo(4.0797f)
                curveTo(2.9197f, 22.0003f, 1.9697f, 21.0703f, 1.9697f, 19.9303f)
                verticalLineTo(5.0904f)
                curveTo(1.9697f, 2.4704f, 3.9197f, 1.2803f, 6.3097f, 2.4504f)
                lineTo(10.7497f, 4.6304f)
                curveTo(11.7097f, 5.1003f, 12.4997f, 6.3503f, 12.4997f, 7.4103f)
                verticalLineTo(22.0003f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 15.0604f)
                verticalLineTo(18.8404f)
                curveTo(21.97f, 21.0004f, 20.97f, 22.0004f, 18.81f, 22.0004f)
                horizontalLineTo(12.5f)
                verticalLineTo(10.4204f)
                lineTo(12.97f, 10.5204f)
                lineTo(17.47f, 11.5304f)
                lineTo(19.5f, 11.9804f)
                curveTo(20.82f, 12.2704f, 21.9f, 12.9504f, 21.96f, 14.8704f)
                curveTo(21.97f, 14.9304f, 21.97f, 14.9904f, 21.97f, 15.0604f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 9.0005f)
                horizontalLineTo(8.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 13.0005f)
                horizontalLineTo(8.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.4697f, 11.5305f)
                verticalLineTo(14.7505f)
                curveTo(17.4697f, 15.9905f, 16.4597f, 17.0005f, 15.2197f, 17.0005f)
                curveTo(13.9797f, 17.0005f, 12.9697f, 15.9905f, 12.9697f, 14.7505f)
                verticalLineTo(10.5205f)
                lineTo(17.4697f, 11.5305f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9597f, 14.8703f)
                curveTo(21.8997f, 16.0503f, 20.9197f, 17.0003f, 19.7197f, 17.0003f)
                curveTo(18.4797f, 17.0003f, 17.4697f, 15.9903f, 17.4697f, 14.7503f)
                verticalLineTo(11.5303f)
                lineTo(19.4997f, 11.9803f)
                curveTo(20.8197f, 12.2703f, 21.8997f, 12.9503f, 21.9597f, 14.8703f)
                close()
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
