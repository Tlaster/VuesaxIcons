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

public val BrokenGroup.Bucketcircle: ImageVector
    get() {
        if (_bucketcircle != null) {
            return _bucketcircle!!
        }
        _bucketcircle = Builder(name = "Bucketcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.4099f, 15.9499f)
                lineTo(7.0199f, 13.56f)
                curveTo(6.2199f, 12.76f, 6.2199f, 11.9599f, 7.0199f, 11.1699f)
                lineTo(11.0099f, 7.1799f)
                lineTo(15.3999f, 11.5699f)
                curveTo(15.6199f, 11.7899f, 15.6199f, 12.1499f, 15.3999f, 12.3699f)
                lineTo(11.8099f, 15.9599f)
                curveTo(11.0099f, 16.7499f, 10.2099f, 16.7499f, 9.4099f, 15.9499f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.209f, 6.3799f)
                lineTo(11.009f, 7.1799f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.459f, 12.3299f)
                lineTo(15.489f, 11.9399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.4691f, 14.1699f)
                curveTo(16.4691f, 14.1699f, 15.3691f, 15.3699f, 15.3691f, 16.0999f)
                curveTo(15.3691f, 16.7099f, 15.8691f, 17.1998f, 16.4691f, 17.1998f)
                curveTo(17.0791f, 17.1998f, 17.5692f, 16.6999f, 17.5692f, 16.0999f)
                curveTo(17.5792f, 15.3599f, 16.4691f, 14.1699f, 16.4691f, 14.1699f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _bucketcircle!!
    }

private var _bucketcircle: ImageVector? = null
