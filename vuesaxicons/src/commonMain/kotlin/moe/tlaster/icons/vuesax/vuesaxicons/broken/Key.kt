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

public val BrokenGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.9906f, 2.15f)
                curveTo(15.3706f, 1.69f, 17.9406f, 2.38f, 19.7906f, 4.22f)
                curveTo(22.7406f, 7.17f, 22.7406f, 11.98f, 19.7906f, 14.92f)
                curveTo(17.7306f, 16.97f, 14.7806f, 17.6f, 12.1906f, 16.79f)
                lineTo(7.4806f, 21.49f)
                curveTo(7.1406f, 21.84f, 6.4706f, 22.05f, 5.9906f, 21.98f)
                lineTo(3.8106f, 21.68f)
                curveTo(3.0906f, 21.58f, 2.4206f, 20.9f, 2.3106f, 20.18f)
                lineTo(2.0106f, 18.0f)
                curveTo(1.9406f, 17.52f, 2.1706f, 16.85f, 2.5006f, 16.51f)
                lineTo(3.6206f, 15.39f)
                lineTo(7.1906f, 11.82f)
                curveTo(6.3906f, 9.22f, 7.0106f, 6.27f, 9.0706f, 4.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8906f, 17.49f)
                lineTo(9.1906f, 19.79f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                curveTo(15.3284f, 11.0f, 16.0f, 10.3284f, 16.0f, 9.5f)
                curveTo(16.0f, 8.6716f, 15.3284f, 8.0f, 14.5f, 8.0f)
                curveTo(13.6716f, 8.0f, 13.0f, 8.6716f, 13.0f, 9.5f)
                curveTo(13.0f, 10.3284f, 13.6716f, 11.0f, 14.5f, 11.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
