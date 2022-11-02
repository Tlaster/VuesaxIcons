package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Ankr: ImageVector
    get() {
        if (_ankr != null) {
            return _ankr!!
        }
        _ankr = Builder(name = "Ankr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9902f, 3.5f)
                lineTo(12.0002f, 2.0f)
                lineTo(20.8903f, 6.44f)
                verticalLineTo(9.78f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1094f, 9.78f)
                verticalLineTo(6.44f)
                lineTo(4.9494f, 5.53f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1094f, 14.22f)
                verticalLineTo(17.56f)
                lineTo(11.9994f, 22.0f)
                lineTo(20.8894f, 17.56f)
                verticalLineTo(14.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.9999f)
                verticalLineTo(16.4399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0005f, 16.4401f)
                curveTo(14.4527f, 16.4401f, 16.4406f, 14.4522f, 16.4406f, 12.0001f)
                curveTo(16.4406f, 9.5479f, 14.4527f, 7.5601f, 12.0005f, 7.5601f)
                curveTo(9.5484f, 7.5601f, 7.5606f, 9.5479f, 7.5606f, 12.0001f)
                curveTo(7.5606f, 14.4522f, 9.5484f, 16.4401f, 12.0005f, 16.4401f)
                close()
            }
        }
        .build()
        return _ankr!!
    }

private var _ankr: ImageVector? = null
