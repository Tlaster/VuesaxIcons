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

public val OutlineGroup.Arrowright1: ImageVector
    get() {
        if (_arrowright1 != null) {
            return _arrowright1!!
        }
        _arrowright1 = Builder(name = "Arrowright1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4291f, 18.8201f)
                curveTo(14.2391f, 18.8201f, 14.0491f, 18.7501f, 13.8991f, 18.6001f)
                curveTo(13.6091f, 18.3101f, 13.6091f, 17.8301f, 13.8991f, 17.5401f)
                lineTo(19.4391f, 12.0001f)
                lineTo(13.8991f, 6.4601f)
                curveTo(13.6091f, 6.1701f, 13.6091f, 5.6901f, 13.8991f, 5.4001f)
                curveTo(14.1891f, 5.1101f, 14.6691f, 5.1101f, 14.9591f, 5.4001f)
                lineTo(21.0291f, 11.4701f)
                curveTo(21.3191f, 11.7601f, 21.3191f, 12.2401f, 21.0291f, 12.5301f)
                lineTo(14.9591f, 18.6001f)
                curveTo(14.8091f, 18.7501f, 14.6191f, 18.8201f, 14.4291f, 18.8201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.33f, 12.75f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 12.75f, 2.75f, 12.41f, 2.75f, 12.0f)
                curveTo(2.75f, 11.59f, 3.09f, 11.25f, 3.5f, 11.25f)
                horizontalLineTo(20.33f)
                curveTo(20.74f, 11.25f, 21.08f, 11.59f, 21.08f, 12.0f)
                curveTo(21.08f, 12.41f, 20.74f, 12.75f, 20.33f, 12.75f)
                close()
            }
        }
        .build()
        return _arrowright1!!
    }

private var _arrowright1: ImageVector? = null
