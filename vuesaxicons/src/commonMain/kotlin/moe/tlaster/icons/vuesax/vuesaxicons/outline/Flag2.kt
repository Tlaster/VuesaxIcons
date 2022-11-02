package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Flag2: ImageVector
    get() {
        if (_flag2 != null) {
            return _flag2!!
        }
        _flag2 = Builder(name = "Flag2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4492f, 22.75f)
                curveTo(6.0392f, 22.75f, 5.6992f, 22.41f, 5.6992f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(5.6992f, 1.59f, 6.0392f, 1.25f, 6.4492f, 1.25f)
                curveTo(6.8592f, 1.25f, 7.1992f, 1.59f, 7.1992f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(7.1992f, 22.41f, 6.8592f, 22.75f, 6.4492f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9491f, 17.7501f)
                curveTo(6.6691f, 17.7501f, 6.4091f, 17.6001f, 6.2791f, 17.3301f)
                curveTo(6.0991f, 16.9601f, 6.2491f, 16.5101f, 6.6191f, 16.3301f)
                lineTo(14.9191f, 12.2301f)
                curveTo(16.1391f, 11.6001f, 16.8291f, 10.8401f, 16.7991f, 10.1301f)
                curveTo(16.7691f, 9.4401f, 16.0291f, 8.7301f, 14.7591f, 8.1901f)
                lineTo(6.6591f, 4.6901f)
                curveTo(6.2691f, 4.5201f, 6.0991f, 4.0801f, 6.2591f, 3.7001f)
                curveTo(6.4191f, 3.3201f, 6.8691f, 3.1401f, 7.2491f, 3.3101f)
                lineTo(15.3491f, 6.8101f)
                curveTo(17.8491f, 7.8701f, 18.2691f, 9.3101f, 18.2991f, 10.0701f)
                curveTo(18.3491f, 11.4001f, 17.3891f, 12.6401f, 15.5991f, 13.5601f)
                lineTo(7.2891f, 17.6701f)
                curveTo(7.1791f, 17.7301f, 7.0591f, 17.7501f, 6.9491f, 17.7501f)
                close()
            }
        }
        .build()
        return _flag2!!
    }

private var _flag2: ImageVector? = null
