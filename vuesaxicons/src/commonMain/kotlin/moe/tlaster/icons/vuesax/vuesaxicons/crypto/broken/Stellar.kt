package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Stellar: ImageVector
    get() {
        if (_stellar != null) {
            return _stellar!!
        }
        _stellar = Builder(name = "Stellar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.36f, 4.99f)
                curveTo(15.1f, 4.2f, 13.6f, 3.75f, 12.0f, 3.75f)
                curveTo(7.44f, 3.75f, 3.75f, 7.44f, 3.75f, 12.0f)
                curveTo(3.75f, 12.76f, 3.85f, 13.49f, 4.04f, 14.19f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.6191f, 18.9899f)
                curveTo(8.8891f, 19.7899f, 10.3891f, 20.2499f, 11.9991f, 20.2499f)
                curveTo(16.5591f, 20.2499f, 20.2491f, 16.5599f, 20.2491f, 11.9999f)
                curveTo(20.2491f, 11.1799f, 20.1291f, 10.3799f, 19.9091f, 9.6399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9297f, 9.44f)
                lineTo(21.9997f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.0001f)
                lineTo(10.05f, 11.5701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                lineTo(2.0f, 19.5f)
            }
        }
        .build()
        return _stellar!!
    }

private var _stellar: ImageVector? = null
