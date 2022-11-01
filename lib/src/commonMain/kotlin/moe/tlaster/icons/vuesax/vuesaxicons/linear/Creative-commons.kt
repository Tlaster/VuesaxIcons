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

public val LinearGroup.`Creative-commons`: ImageVector
    get() {
        if (`_creative-commons` != null) {
            return `_creative-commons`!!
        }
        `_creative-commons` = Builder(name = "Creative-commons", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.88f, 14.1499f)
                curveTo(10.37f, 14.5899f, 9.71f, 14.8699f, 8.99f, 14.8699f)
                curveTo(7.41f, 14.8699f, 6.12f, 13.5899f, 6.12f, 11.9999f)
                curveTo(6.12f, 10.4099f, 7.4f, 9.1299f, 8.99f, 9.1299f)
                curveTo(9.72f, 9.1299f, 10.38f, 9.3998f, 10.88f, 9.8498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.88f, 14.1499f)
                curveTo(17.37f, 14.5899f, 16.71f, 14.8699f, 15.99f, 14.8699f)
                curveTo(14.41f, 14.8699f, 13.12f, 13.5899f, 13.12f, 11.9999f)
                curveTo(13.12f, 10.4099f, 14.4f, 9.1299f, 15.99f, 9.1299f)
                curveTo(16.72f, 9.1299f, 17.38f, 9.3998f, 17.88f, 9.8498f)
            }
        }
        .build()
        return `_creative-commons`!!
    }

private var `_creative-commons`: ImageVector? = null
