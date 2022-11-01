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

public val LinearGroup.`Search-favorite-1`: ImageVector
    get() {
        if (`_search-favorite-1` != null) {
            return `_search-favorite-1`!!
        }
        `_search-favorite-1` = Builder(name = "Search-favorite-1", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveTo(20.0f, 15.97f, 15.97f, 20.0f, 11.0f, 20.0f)
                curveTo(6.03f, 20.0f, 2.0f, 15.97f, 2.0f, 11.0f)
                curveTo(2.0f, 6.03f, 6.03f, 2.0f, 11.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.4999f, 6.13f)
                curveTo(13.1499f, 5.03f, 13.5599f, 3.66f, 14.7199f, 3.29f)
                curveTo(15.3299f, 3.09f, 16.0799f, 3.26f, 16.5099f, 3.85f)
                curveTo(16.9099f, 3.24f, 17.6899f, 3.1f, 18.2899f, 3.29f)
                curveTo(19.4499f, 3.66f, 19.8599f, 5.03f, 19.5099f, 6.13f)
                curveTo(18.9599f, 7.88f, 17.0399f, 8.79f, 16.5099f, 8.79f)
                curveTo(15.9699f, 8.79f, 14.0699f, 7.9f, 13.4999f, 6.13f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9299f, 20.6898f)
                curveTo(19.4599f, 22.2898f, 20.6699f, 22.4498f, 21.5999f, 21.0498f)
                curveTo(22.4499f, 19.7698f, 21.8899f, 18.7198f, 20.3499f, 18.7198f)
                curveTo(19.2099f, 18.7098f, 18.5699f, 19.5998f, 18.9299f, 20.6898f)
                close()
            }
        }
        .build()
        return `_search-favorite-1`!!
    }

private var `_search-favorite-1`: ImageVector? = null
