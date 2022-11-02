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

public val LinearGroup.Microphoneslash: ImageVector
    get() {
        if (_microphoneslash != null) {
            return _microphoneslash!!
        }
        _microphoneslash = Builder(name = "Microphoneslash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.82f, 6.53f)
                curveTo(17.16f, 3.93f, 14.81f, 2.0f, 12.0f, 2.0f)
                curveTo(8.69f, 2.0f, 6.0f, 4.69f, 6.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 14.46f, 6.52f, 15.8f, 7.39f, 16.84f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9999f, 9.98f)
                verticalLineTo(13.0f)
                curveTo(17.9999f, 16.31f, 15.3099f, 19.0f, 11.9999f, 19.0f)
                curveTo(11.2699f, 19.0f, 10.5599f, 18.87f, 9.9199f, 18.63f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.8601f, 19.58f)
                curveTo(7.4701f, 21.08f, 9.6301f, 22.0f, 12.0001f, 22.0f)
                curveTo(16.9701f, 22.0f, 21.0001f, 17.97f, 21.0001f, 13.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5f, 2.99f)
                lineTo(2.5f, 21.99f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.55f, 5.5f)
                verticalLineTo(2.26f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 3.5f)
                verticalLineTo(7.5f)
            }
        }
        .build()
        return _microphoneslash!!
    }

private var _microphoneslash: ImageVector? = null
