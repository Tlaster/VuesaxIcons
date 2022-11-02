package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = Builder(name = "Profile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.38f, 2.0f, 7.25f, 4.13f, 7.25f, 6.75f)
                curveTo(7.25f, 9.32f, 9.26f, 11.4f, 11.88f, 11.49f)
                curveTo(11.96f, 11.48f, 12.04f, 11.48f, 12.1f, 11.49f)
                curveTo(12.12f, 11.49f, 12.13f, 11.49f, 12.15f, 11.49f)
                curveTo(12.16f, 11.49f, 12.16f, 11.49f, 12.17f, 11.49f)
                curveTo(14.73f, 11.4f, 16.74f, 9.32f, 16.75f, 6.75f)
                curveTo(16.75f, 4.13f, 14.62f, 2.0f, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0809f, 14.1499f)
                curveTo(14.2909f, 12.2899f, 9.7409f, 12.2899f, 6.9309f, 14.1499f)
                curveTo(5.6609f, 14.9999f, 4.9609f, 16.1499f, 4.9609f, 17.3799f)
                curveTo(4.9609f, 18.6099f, 5.6609f, 19.7499f, 6.9209f, 20.5899f)
                curveTo(8.3209f, 21.5299f, 10.1609f, 21.9999f, 12.0009f, 21.9999f)
                curveTo(13.8409f, 21.9999f, 15.6809f, 21.5299f, 17.0809f, 20.5899f)
                curveTo(18.3409f, 19.7399f, 19.0409f, 18.5999f, 19.0409f, 17.3599f)
                curveTo(19.0309f, 16.1299f, 18.3409f, 14.9899f, 17.0809f, 14.1499f)
                close()
            }
        }
        .build()
        return _profile!!
    }

private var _profile: ImageVector? = null
