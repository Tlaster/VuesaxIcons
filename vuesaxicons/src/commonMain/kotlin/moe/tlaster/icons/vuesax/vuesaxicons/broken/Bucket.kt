package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6891f, 3.29f)
                lineTo(17.0391f, 10.6401f)
                curveTo(17.4091f, 11.0101f, 17.4091f, 11.61f, 17.0391f, 11.98f)
                lineTo(11.0191f, 18.0001f)
                curveTo(9.6791f, 19.3401f, 8.3491f, 19.3401f, 7.0091f, 18.0001f)
                lineTo(2.9991f, 13.9901f)
                curveTo(1.6591f, 12.6501f, 1.6591f, 11.32f, 2.9991f, 9.98f)
                lineTo(7.3091f, 5.67f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3496f, 1.9502f)
                lineTo(9.6896f, 3.2902f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0703f, 11.9197f)
                lineTo(17.1903f, 11.2598f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 22.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.85f, 15.0f)
                curveTo(18.85f, 15.0f, 17.0f, 17.01f, 17.0f, 18.24f)
                curveTo(17.0f, 19.26f, 17.83f, 20.09f, 18.85f, 20.09f)
                curveTo(19.87f, 20.09f, 20.7f, 19.26f, 20.7f, 18.24f)
                curveTo(20.7f, 17.01f, 18.85f, 15.0f, 18.85f, 15.0f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
