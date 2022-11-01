package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.51f, 2.83f)
                horizontalLineTo(8.49f)
                curveTo(6.0f, 2.83f, 5.45f, 4.07f, 5.13f, 5.59f)
                lineTo(4.0f, 11.0f)
                horizontalLineTo(20.0f)
                lineTo(18.87f, 5.59f)
                curveTo(18.55f, 4.07f, 18.0f, 2.83f, 15.51f, 2.83f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.99f, 19.82f)
                curveTo(22.1f, 20.99f, 21.16f, 22.0f, 19.96f, 22.0f)
                horizontalLineTo(18.08f)
                curveTo(17.0f, 22.0f, 16.85f, 21.54f, 16.66f, 20.97f)
                lineTo(16.46f, 20.37f)
                curveTo(16.18f, 19.55f, 16.0f, 19.0f, 14.56f, 19.0f)
                horizontalLineTo(9.44f)
                curveTo(8.0f, 19.0f, 7.79f, 19.62f, 7.54f, 20.37f)
                lineTo(7.34f, 20.97f)
                curveTo(7.15f, 21.54f, 7.0f, 22.0f, 5.92f, 22.0f)
                horizontalLineTo(4.04f)
                curveTo(2.84f, 22.0f, 1.9f, 20.99f, 2.01f, 19.82f)
                lineTo(2.57f, 13.73f)
                curveTo(2.71f, 12.23f, 3.0f, 11.0f, 5.62f, 11.0f)
                horizontalLineTo(18.38f)
                curveTo(21.0f, 11.0f, 21.29f, 12.23f, 21.43f, 13.73f)
                lineTo(21.99f, 19.82f)
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
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineTo(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 5.0f)
                horizontalLineTo(13.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                horizontalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineTo(18.0f)
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
