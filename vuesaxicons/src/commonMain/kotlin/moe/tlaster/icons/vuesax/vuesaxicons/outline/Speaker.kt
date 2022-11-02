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

public val OutlineGroup.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(5.58f, 22.75f, 4.25f, 21.42f, 4.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(4.25f, 2.58f, 5.58f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(18.42f, 1.25f, 19.75f, 2.58f, 19.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.75f, 21.42f, 18.42f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(6.42f, 2.75f, 5.75f, 3.42f, 5.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(5.75f, 20.58f, 6.42f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(17.58f, 21.25f, 18.25f, 20.58f, 18.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(18.25f, 3.42f, 17.58f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.75f)
                curveTo(9.93f, 18.75f, 8.25f, 17.07f, 8.25f, 15.0f)
                curveTo(8.25f, 12.93f, 9.93f, 11.25f, 12.0f, 11.25f)
                curveTo(14.07f, 11.25f, 15.75f, 12.93f, 15.75f, 15.0f)
                curveTo(15.75f, 17.07f, 14.07f, 18.75f, 12.0f, 18.75f)
                close()
                moveTo(12.0f, 12.75f)
                curveTo(10.76f, 12.75f, 9.75f, 13.76f, 9.75f, 15.0f)
                curveTo(9.75f, 16.24f, 10.76f, 17.25f, 12.0f, 17.25f)
                curveTo(13.24f, 17.25f, 14.25f, 16.24f, 14.25f, 15.0f)
                curveTo(14.25f, 13.76f, 13.24f, 12.75f, 12.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 8.74f, 9.75f, 7.5f)
                curveTo(9.75f, 6.26f, 10.76f, 5.25f, 12.0f, 5.25f)
                curveTo(13.24f, 5.25f, 14.25f, 6.26f, 14.25f, 7.5f)
                curveTo(14.25f, 8.74f, 13.24f, 9.75f, 12.0f, 9.75f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(11.59f, 6.75f, 11.25f, 7.09f, 11.25f, 7.5f)
                curveTo(11.25f, 7.91f, 11.59f, 8.25f, 12.0f, 8.25f)
                curveTo(12.41f, 8.25f, 12.75f, 7.91f, 12.75f, 7.5f)
                curveTo(12.75f, 7.09f, 12.41f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
