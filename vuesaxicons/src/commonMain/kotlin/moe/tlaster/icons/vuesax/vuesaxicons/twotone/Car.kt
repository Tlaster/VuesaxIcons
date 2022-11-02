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

public val TwotoneGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.51f, 2.8301f)
                horizontalLineTo(8.49f)
                curveTo(6.0f, 2.8301f, 5.45f, 4.0701f, 5.13f, 5.5901f)
                lineTo(4.0f, 11.0001f)
                horizontalLineTo(20.0f)
                lineTo(18.87f, 5.5901f)
                curveTo(18.55f, 4.0701f, 18.0f, 2.8301f, 15.51f, 2.8301f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9907f, 19.82f)
                curveTo(22.1007f, 20.99f, 21.1607f, 22.0f, 19.9607f, 22.0f)
                horizontalLineTo(18.0807f)
                curveTo(17.0007f, 22.0f, 16.8507f, 21.54f, 16.6607f, 20.97f)
                lineTo(16.4607f, 20.37f)
                curveTo(16.1807f, 19.55f, 16.0007f, 19.0f, 14.5607f, 19.0f)
                horizontalLineTo(9.4407f)
                curveTo(8.0007f, 19.0f, 7.7907f, 19.62f, 7.5407f, 20.37f)
                lineTo(7.3407f, 20.97f)
                curveTo(7.1507f, 21.54f, 7.0007f, 22.0f, 5.9207f, 22.0f)
                horizontalLineTo(4.0407f)
                curveTo(2.8407f, 22.0f, 1.9007f, 20.99f, 2.0107f, 19.82f)
                lineTo(2.5707f, 13.73f)
                curveTo(2.7107f, 12.23f, 3.0007f, 11.0f, 5.6207f, 11.0f)
                horizontalLineTo(18.3807f)
                curveTo(21.0007f, 11.0f, 21.2907f, 12.23f, 21.4307f, 13.73f)
                lineTo(21.9907f, 19.82f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                horizontalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                horizontalLineTo(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineTo(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 5.0f)
                horizontalLineTo(13.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                horizontalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineTo(18.0f)
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
