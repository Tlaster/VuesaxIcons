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

public val BrokenGroup.Mask: ImageVector
    get() {
        if (_mask != null) {
            return _mask!!
        }
        _mask = Builder(name = "Mask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 14.76f, 3.12f, 17.26f, 4.93f, 19.07f)
                lineTo(19.07f, 4.93f)
                curveTo(17.26f, 3.12f, 14.76f, 2.0f, 12.0f, 2.0f)
                curveTo(8.07f, 2.0f, 4.67f, 4.27f, 3.03f, 7.57f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9997f, 11.9999f)
                curveTo(21.9997f, 17.5199f, 17.5197f, 21.9999f, 11.9997f, 21.9999f)
                curveTo(9.2397f, 21.9999f, 6.7397f, 20.8799f, 4.9297f, 19.0699f)
                lineTo(19.0697f, 4.9299f)
                curveTo(20.8797f, 6.7399f, 21.9997f, 9.2399f, 21.9997f, 11.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.7598f, 16.24f)
                lineTo(13.4097f, 21.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.2891f, 12.71f)
                lineTo(17.8691f, 19.28f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8301f, 9.1699f)
                lineTo(21.1201f, 15.4699f)
            }
        }
        .build()
        return _mask!!
    }

private var _mask: ImageVector? = null
