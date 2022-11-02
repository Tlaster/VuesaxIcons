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

public val OutlineGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.75f)
                curveTo(8.83f, 12.75f, 6.25f, 10.17f, 6.25f, 7.0f)
                curveTo(6.25f, 3.83f, 8.83f, 1.25f, 12.0f, 1.25f)
                curveTo(15.17f, 1.25f, 17.75f, 3.83f, 17.75f, 7.0f)
                curveTo(17.75f, 10.17f, 15.17f, 12.75f, 12.0f, 12.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(9.66f, 2.75f, 7.75f, 4.66f, 7.75f, 7.0f)
                curveTo(7.75f, 9.34f, 9.66f, 11.25f, 12.0f, 11.25f)
                curveTo(14.34f, 11.25f, 16.25f, 9.34f, 16.25f, 7.0f)
                curveTo(16.25f, 4.66f, 14.34f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5901f, 22.75f)
                curveTo(20.1801f, 22.75f, 19.8401f, 22.41f, 19.8401f, 22.0f)
                curveTo(19.8401f, 18.55f, 16.3202f, 15.75f, 12.0002f, 15.75f)
                curveTo(7.6802f, 15.75f, 4.1602f, 18.55f, 4.1602f, 22.0f)
                curveTo(4.1602f, 22.41f, 3.8202f, 22.75f, 3.4102f, 22.75f)
                curveTo(3.0002f, 22.75f, 2.6602f, 22.41f, 2.6602f, 22.0f)
                curveTo(2.6602f, 17.73f, 6.8502f, 14.25f, 12.0002f, 14.25f)
                curveTo(17.1502f, 14.25f, 21.3401f, 17.73f, 21.3401f, 22.0f)
                curveTo(21.3401f, 22.41f, 21.0001f, 22.75f, 20.5901f, 22.75f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
