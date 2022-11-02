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

public val BrokenGroup.Celsius: ImageVector
    get() {
        if (_celsius != null) {
            return _celsius!!
        }
        _celsius = Builder(name = "Celsius", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3306f, 15.28f)
                curveTo(15.3406f, 16.59f, 13.7605f, 17.43f, 12.0005f, 17.43f)
                curveTo(9.0006f, 17.43f, 6.5606f, 15.0001f, 6.5606f, 11.9901f)
                curveTo(6.5606f, 8.9801f, 8.9906f, 6.55f, 12.0005f, 6.55f)
                curveTo(13.2305f, 6.55f, 14.3606f, 6.9601f, 15.2706f, 7.64f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.42f, 11.34f)
                curveTo(18.0662f, 11.34f, 18.59f, 10.8162f, 18.59f, 10.17f)
                curveTo(18.59f, 9.5238f, 18.0662f, 9.0f, 17.42f, 9.0f)
                curveTo(16.7738f, 9.0f, 16.25f, 9.5238f, 16.25f, 10.17f)
                curveTo(16.25f, 10.8162f, 16.7738f, 11.34f, 17.42f, 11.34f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
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
        return _celsius!!
    }

private var _celsius: ImageVector? = null
