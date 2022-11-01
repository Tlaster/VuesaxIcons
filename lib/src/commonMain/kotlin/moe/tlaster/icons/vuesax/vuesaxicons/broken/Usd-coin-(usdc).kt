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

public val BrokenGroup.`Usd-coin-(usdc)`: ImageVector
    get() {
        if (`_usd-coin-(usdc)` != null) {
            return `_usd-coin-(usdc)`!!
        }
        `_usd-coin-(usdc)` = Builder(name = "Usd-coin-(usdc)", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9492f, 16.95f)
                curveTo(19.6792f, 14.22f, 19.6792f, 9.7801f, 16.9492f, 7.05f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0494f, 7.05f)
                curveTo(4.3194f, 9.7801f, 4.3194f, 14.22f, 7.0494f, 16.95f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6699f, 13.63f)
                curveTo(9.6699f, 14.53f, 10.3699f, 15.26f, 11.2299f, 15.26f)
                horizontalLineTo(12.9899f)
                curveTo(13.7399f, 15.26f, 14.3499f, 14.62f, 14.3499f, 13.84f)
                curveTo(14.3499f, 12.99f, 13.9799f, 12.68f, 13.4199f, 12.49f)
                lineTo(10.6099f, 11.51f)
                curveTo(10.0599f, 11.32f, 9.6799f, 11.01f, 9.6799f, 10.16f)
                curveTo(9.6799f, 9.37f, 10.2899f, 8.74f, 11.0399f, 8.74f)
                horizontalLineTo(12.7999f)
                curveTo(13.6599f, 8.74f, 14.3599f, 9.47f, 14.3599f, 10.37f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.8f)
                verticalLineTo(16.2f)
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
        return `_usd-coin-(usdc)`!!
    }

private var `_usd-coin-(usdc)`: ImageVector? = null
